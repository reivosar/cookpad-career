package ticketmodeling.domain.model.movie;

import reivosar.common.util.model.Identity;

public class MovieId extends Identity<MovieId>
{
	final String value;

	public MovieId(final String value) {
		this.value = value;
	}
}
