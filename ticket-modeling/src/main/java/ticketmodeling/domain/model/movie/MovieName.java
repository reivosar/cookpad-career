package ticketmodeling.domain.model.movie;

import reivosar.common.util.model.ValueObject;

public class MovieName extends ValueObject<MovieName>
{
	final String value;

	public MovieName(final String value) {
		this.value = value;
	}
}
