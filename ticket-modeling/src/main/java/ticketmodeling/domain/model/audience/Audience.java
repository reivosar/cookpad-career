package ticketmodeling.domain.model.audience;

import reivosar.common.domain.model.money.Money;
import reivosar.common.domain.model.time.HourMinute;
import reivosar.common.domain.model.time.YearMonthDay;
import reivosar.common.util.model.Entity;
import ticketmodeling.domain.model.price.DateAndTimePriceSpecific;
import ticketmodeling.domain.model.price.Price;
import ticketmodeling.domain.model.schedule.Schedule;
import ticketmodeling.domain.model.schedule.ScheduledTime;
import ticketmodeling.domain.model.ticket.Ticket;

public abstract class Audience<ENTITY extends Audience<ENTITY>>
	extends Entity<AudienceId, ENTITY>
{
	final AudienceId id;

	public Audience(AudienceId id) {
		this.id = id;
	}

	public final Price calcScreenPrice(final YearMonthDay ymd, final HourMinute hm) {
		DateAndTimePriceSpecific specific = new DateAndTimePriceSpecific(
				type().priceTable(), ymd, hm);
		return specific.calcPrice();
	}

	public final Price calcScreenPrice(final ScheduledTime scheduledTime) {
		return calcScreenPrice(scheduledTime.yearMonthDay(), scheduledTime.hourMinute());
	}

	public final Ticket selectTicketToBuy(final Schedule schedule) {
		return new Ticket(id, schedule.publicId(), calcScreenPrice(schedule.time()));
	}

	public final Ticket buyTicket(final Schedule schedule, final Money money) {
		return selectTicketToBuy(schedule).buyTicket(money);
	}

	@Override
	public AudienceId publicId() {
		return id;
	}

	protected abstract AudienceType type();
}
