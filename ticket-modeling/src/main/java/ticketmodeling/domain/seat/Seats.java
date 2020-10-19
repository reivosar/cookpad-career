package ticketmodeling.domain.screen;

import java.util.Collection;
import java.util.stream.Collectors;

import ticketmodeling.common.domain.shared.ValueObject;

public class Seats extends ValueObject<Seats>
{
	final SeatCapacity capacity;
	final Collection<Seat> seats;

	public Seats(SeatCapacity capacity, Collection<Seat> seats) {
		this.capacity = capacity;
		this.seats    = seats;
	}

	public Collection<Seat> allSeats() {
		return this.seats;
	}

	public int capacityNumber() {
		return capacity.value;
	}

	public int reservableSeatNunber() {
		return reservableSeats().size();
	}

	public boolean reserveAvailable() {
		return reservableSeatNunber() > 0;
	}

	public Collection<Seat> reservableSeats() {
		return allSeats().stream()
			.filter(seat -> seat.notReserved())
			.collect(Collectors.toList());
	}

	public Collection<Seat> reservedSeats() {
		return allSeats().stream()
			.filter(seat -> seat.reserved())
			.collect(Collectors.toList());
	}
}
