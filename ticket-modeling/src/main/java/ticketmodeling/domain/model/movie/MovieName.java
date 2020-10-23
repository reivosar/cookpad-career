package ticketmodeling.domain.model.movie;

import reivosar.common.domain.model.ValueObject;

public class MovieName extends ValueObject<MovieName>
{
	final String value;

	public MovieName(String value) {
		this.value = value;
	}
}
