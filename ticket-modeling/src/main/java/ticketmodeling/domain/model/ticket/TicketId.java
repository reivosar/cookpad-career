package ticketmodeling.domain.model.ticket;

import reivosar.common.util.model.Identity;

public class TicketId extends Identity<TicketId>
{
	final String value;

	public TicketId() {
		this.value = genereteNativeIdByUUID();
	}
}
