package ticketmodeling.domain.price.audience;

public class NormalAudiencePriceTable extends PriceTableTemplate
{
	@Override
	protected int weekdayNormalPrimitivePrice() {
		return 1800;
	}

	@Override
	protected int weekdayLateShowPrimitivePrice() {
		return 1300;
	}

	@Override
	protected int holidayNormalPrimitivePrice() {
		return 1800;
	}

	@Override
	protected int holidayLateShowPrimitivePrice() {
		return 1300;
	}

	@Override
	protected int movieDayPrimitivePrice() {
		return 1100;
	}
}
