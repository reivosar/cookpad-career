package ticketmodeling.domain.model.screen;

import reivosar.common.util.model.ValueObject;
import ticketmodeling.domain.model.schedule.ScheduleId;

public class SeatReservation extends ValueObject<SeatReservation>
{
	final ScheduleId scheduleId;
	final SeatReservationType reservationType;

	public SeatReservation(final ScheduleId scheduleId, final SeatReservationType reservationType) {
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
