package ticketmodeling.domain.price.audience;

public class CinemaCitizenAudiencePriceTable extends PriceTableTemplate
{
	@Override
	protected int weekdayNormalPrimitivePrice() {
		return 1000;
	}

	@Override
	protected int weekdayLateShowPrimitivePrice() {
		return 1000;
	}

	@Override
	protected int holidayNormalPrimitivePrice() {
		return 1300;
	}

	@Override
	protected int holidayLateShowPrimitivePrice() {
		return 1000;
	}

	@Override
	protected int movieDayPrimitivePrice() {
		return 1100;
	}
}

