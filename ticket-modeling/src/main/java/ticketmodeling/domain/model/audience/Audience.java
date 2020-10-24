package ticketmodeling.domain.model.audience;

import reivosar.common.domain.model.Entity;
import reivosar.common.domain.model.time.HourMinute;
import reivosar.common.domain.model.time.YearMonthDay;
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

	public Price calcScreenPrice(YearMonthDay ymd, HourMinute hm) {
		DateAndTimePriceSpecific specific = new DateAndTimePriceSpecific(
				type().priceTable(), ymd, hm);
		return specific.calcPrice();
	}

	public Price calcPrice(ScheduledTime scheduledTime) {
		return calcScreenPrice(scheduledTime.yearMonthDay(), scheduledTime.hourMinute());
	}

	public Ticket selectTicketToBuy(Schedule schedule) {
		return new Ticket(id, schedule.publicId(), calcPrice(schedule.time()));
	}

	public Ticket buyTicket(Schedule schedule) {
		return selectTicketToBuy(schedule).buyTicket();
	}

	@Override
	public AudienceId publicId() {
		return id;
	}

	protected abstract AudienceType type();
}
