package ticketmodeling.domain.model.movie;

import ticketmodeling.common.domain.model.Identity;

public class MovieId extends Identity<MovieId>
{
	final String value;

	public MovieId(String value) {
		this.value = value;
	}
}
