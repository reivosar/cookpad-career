package ticketmodeling.domain.audience;

import ticketmodeling.common.domain.shared.Entity;
import ticketmodeling.common.domain.shared.primitive.HourMinute;
import ticketmodeling.common.domain.shared.primitive.YearMonthDay;
import ticketmodeling.domain.price.DateAndTimePriceSpecific;
import ticketmodeling.domain.price.Price;

public abstract class Audience<ENTITY extends Audience<ENTITY>>
	extends Entity<AudienceId, ENTITY>
{
	final AudienceId id;
	final AudienceProfile profile;

	public Audience(AudienceId id, AudienceProfile profile) {
		this.id = id;
		this.profile = profile;
	}

	public Price calcPrice(YearMonthDay ymd, HourMinute hm) {
		DateAndTimePriceSpecific specific = new DateAndTimePriceSpecific(
				type().priceTable(), ymd, hm);
		return specific.calcPrice();
	}

	protected abstract AudienceType type();
}
