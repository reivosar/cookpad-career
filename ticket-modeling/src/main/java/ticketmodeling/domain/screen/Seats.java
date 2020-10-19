package ticketmodeling.domain.screen;

import java.util.Collection;

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
}
