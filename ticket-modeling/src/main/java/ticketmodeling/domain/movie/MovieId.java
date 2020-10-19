package ticketmodeling.domain.movie;

import ticketmodeling.common.domain.shared.Identity;

public class MovieId extends Identity<MovieId>
{
	final String value;

	public MovieId(String value) {
		this.value = value;
	}
}
