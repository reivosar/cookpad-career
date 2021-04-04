package ticketmodeling.domain.model.screen;

import reivosar.common.util.model.ValueObject;

public class ScreenProfile extends ValueObject<ScreenProfile>
{
	final ScreenName screenName;
	final SeatCapacity capacity;

	public ScreenProfile(final ScreenName screenName, final SeatCapacity capacity) {
		this.screenName = screenName;
		this.capacity   = capacity;
	}

	public int capacityNumber() {
		return capacity.value;
	}
}
