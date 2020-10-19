package ticketmodeling.domain.audience;

public enum AudienceType
{
	CINEMA_CITIZEN("シネマシティズン"),
	SENIOR_CINEMA_CITIZEN("シネマシティズン（60才以上）"),
	NORMAL("一般"),
	SENIOR("シニア（70才以上）"),
	UNIVERSITY("学生（大・専）"),
	STUDENT("中・高校生"),
	CHILD("幼児（3才以上）・小学生"),
	HANDICAPPED("障がい者（学生以上）"),
	JUNIOR_HANDICAPPED("障がい者（高校以下）"),
	;

	private String label;

	private AudienceType(String label) {
		this.label = label;
	}

	public String label() {
		return label;
	}
}
