package ticketmodeling.domain.screen;

import ticketmodeling.common.domain.shared.ValueObject;
import ticketmodeling.domain.schedule.ScheduleId;

public class SeatReservation extends ValueObject<SeatReservation>
{
	final ScheduleId scheduleId;
	final SeatReservationType reservationType;

	public SeatReservation(ScheduleId scheduleId, SeatReservationType reservationType) {
		this.scheduleId      = scheduleId;
		this.reservationType = reservationType;
	}

	public boolean reserved() {
		return this.reservationType.reserved();
	}

	public boolean noReservation() {
		return !reserved();
	}

}
