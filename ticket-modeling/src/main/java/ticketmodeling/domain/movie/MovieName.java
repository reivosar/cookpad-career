package ticketmodeling.domain.movie;

import ticketmodeling.common.domain.shared.ValueObject;

public class MovieName extends ValueObject<MovieName>
{
	final String value;

	public MovieName(String value) {
		this.value = value;
	}
}
