package ticketmodeling.domain.model.screen;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import reivosar.common.domain.model.ValueObject;
import ticketmodeling.domain.model.schedule.ScheduleId;

public class Seats extends ValueObject<Seats>
{
	final Collection<Seat> seats;

	public Seats(Collection<Seat> seats) {
		this.seats = seats;
	}

	public boolean reservationPossible(ScheduleId scheduleId) {
		return emptyScheduledSeats(scheduleId).size() > 0;
	}

	public Collection<Seat> allScheduledSeats(ScheduleId scheduleId) {
		return this.seats.stream()
			.filter(seat -> seat.scheduleId().equals(scheduleId))
			.collect(Collectors.toUnmodifiableList());
	}

	public Collection<Seat> reserveScheduledSeats(ScheduleId scheduleId) {
		return this.allScheduledSeats(scheduleId).stream()
			.filter(seat -> seat.reservedSeat())
			.collect(Collectors.toUnmodifiableList());
	}

	public Collection<Seat> emptyScheduledSeats(ScheduleId scheduleId) {
		return this.allScheduledSeats(scheduleId).stream()
			.filter(seat -> seat.emptySeat())
			.collect(Collectors.toUnmodifiableList());
	}

	public Collection<ScheduleId> allSchedules() {
		return seats.stream()
			.flatMap(seat -> Stream.of(seat.scheduleId()))
			.collect(Collectors.toUnmodifiableSet());
	}
}
