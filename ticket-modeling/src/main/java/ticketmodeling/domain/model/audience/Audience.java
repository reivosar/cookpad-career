package ticketmodeling.domain.model.audience;

import ticketmodeling.common.domain.model.Entity;
import ticketmodeling.common.domain.model.primitive.HourMinute;
import ticketmodeling.common.domain.model.primitive.YearMonthDay;
import ticketmodeling.domain.model.price.DateAndTimePriceSpecific;
import ticketmodeling.domain.model.price.Price;

public abstract class Audience<ENTITY extends Audience<ENTITY>>
	extends Entity<AudienceId, ENTITY>
{
	final AudienceId id;

	public Audience(AudienceId id) {
		this.id = id;
	}

	public Price calcPrice(YearMonthDay ymd, HourMinute hm) {
		DateAndTimePriceSpecific specific = new DateAndTimePriceSpecific(
				type().priceTable(), ymd, hm);
		return specific.calcPrice();
	}

	protected abstract AudienceType type();
}
