package ticketmodeling.domain.model.movie;

import ticketmodeling.common.domain.model.ValueObject;

public class MovieName extends ValueObject<MovieName>
{
	final String value;

	public MovieName(String value) {
		this.value = value;
	}
}
