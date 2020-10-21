package ticketmodeling.domain.model.screen;

import ticketmodeling.common.domain.model.ValueObject;

public class ScreenProfile extends ValueObject<ScreenProfile>
{
	final ScreenName screenName;
	final SeatCapacity capacity;

	public ScreenProfile(ScreenName screenName, SeatCapacity capacity) {
		this.screenName = screenName;
		this.capacity   = capacity;
	}

	public int capacityNumber() {
		return capacity.value;
	}
}
