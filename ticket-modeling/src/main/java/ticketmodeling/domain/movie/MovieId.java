package ticketmodeling.domain.movie;

import ticketmodeling.domain.shared.Identity;

public class MovieId extends Identity<MovieId>
{
	final String value;

	public MovieId(String value) {
		this.value = value;
	}
}
