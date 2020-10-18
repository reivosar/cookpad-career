package ticketmodeling.domain.movie;

import ticketmodeling.domain.shared.ValueObject;

public class MovieProfile extends ValueObject<MovieProfile>
{
	final MovieName name;

	public MovieProfile(MovieName name) {
		this.name = name;
	}
}
