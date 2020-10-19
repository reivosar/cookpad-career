package ticketmodeling.domain.audience;

import ticketmodeling.domain.price.PriceType;

public enum AudienceType
{
	CINEMA_CITIZEN("シネマシティズン", PriceType.CINEMA_CITIZEN),
	SENIOR_CINEMA_CITIZEN("シネマシティズン（60才以上）",PriceType.SENIOR_CINEMA_CITIZEN),
	NORMAL("一般",PriceType.NORMAL),
	SENIOR("シニア（70才以上）",PriceType.SENIOR),
	UNIVERSITY("学生（大・専）",PriceType.UNIVERSITY),
	STUDENT("中・高校生",PriceType.STUDENT),
	CHILD("幼児（3才以上）・小学生",PriceType.CHILD),
	HANDICAPPED("障がい者（学生以上）",PriceType.HANDICAPPED),
	JUNIOR_HANDICAPPED("障がい者（高校以下）",PriceType.JUNIOR_HANDICAPPED),
	;

	private final String label;
	private final PriceType priceType;

	private AudienceType(String label, PriceType priceType) {
		this.label = label;
		this.priceType = priceType;
	}

	public String label() {
		return label;
	}

	public PriceType priceType() {
		return priceType;
	}
}
