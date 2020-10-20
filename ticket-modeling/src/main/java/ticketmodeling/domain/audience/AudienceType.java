package ticketmodeling.domain.audience;

import ticketmodeling.domain.audience.price.ChildAudiencePriceTable;
import ticketmodeling.domain.audience.price.HandicappedAudiencePriceTable;
import ticketmodeling.domain.audience.price.JuniorHandicappedAudiencePriceTable;
import ticketmodeling.domain.audience.price.NormalAudiencePriceTable;
import ticketmodeling.domain.audience.price.SeniorAudiencePriceTable;
import ticketmodeling.domain.audience.price.SeniorCinemaCitizenAudiencePriceTable;
import ticketmodeling.domain.audience.price.StudentAudiencePriceTable;
import ticketmodeling.domain.audience.price.UniversityAudiencePriceTable;
import ticketmodeling.domain.price.DateAndTimePriceTable;

public enum AudienceType
{
	CINEMA_CITIZEN("シネマシティズン") {
		@Override
		public DateAndTimePriceTable priceTable() {
			return new ChildAudiencePriceTable();
		}
	},
	SENIOR_CINEMA_CITIZEN("シネマシティズン（60才以上）") {
		@Override
		public DateAndTimePriceTable priceTable() {
			return new SeniorCinemaCitizenAudiencePriceTable();
		}
	},
	NORMAL("一般") {
		@Override
		public DateAndTimePriceTable priceTable() {
			return new NormalAudiencePriceTable();
		}
	},
	SENIOR("シニア（70才以上）") {
		@Override
		public DateAndTimePriceTable priceTable() {
			return new SeniorAudiencePriceTable();
		}
	},
	UNIVERSITY("学生（大・専）") {
		@Override
		public DateAndTimePriceTable priceTable() {
			return new UniversityAudiencePriceTable();
		}
	},
	STUDENT("中・高校生") {
		@Override
		public DateAndTimePriceTable priceTable() {
			return new StudentAudiencePriceTable();
		}
	},
	CHILD("幼児（3才以上）・小学生") {
		@Override
		public DateAndTimePriceTable priceTable() {
			return new ChildAudiencePriceTable();
		}
	},
	HANDICAPPED("障がい者（学生以上）") {
		@Override
		public DateAndTimePriceTable priceTable() {
			return new HandicappedAudiencePriceTable();
		}
	},
	JUNIOR_HANDICAPPED("障がい者（高校以下）") {
		@Override
		public DateAndTimePriceTable priceTable() {
			return new JuniorHandicappedAudiencePriceTable();
		}
	},
	;

	private final String label;

	private AudienceType(String label) {
		this.label = label;
	}

	public String label() {
		return label;
	}

	public abstract DateAndTimePriceTable priceTable();
}
