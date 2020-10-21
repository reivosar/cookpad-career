package ticketmodeling.domain.model.movie;

import ticketmodeling.common.domain.model.ValueObject;

public class MovieProfile extends ValueObject<MovieProfile>
{
	final MovieName name;

	public MovieProfile(MovieName name) {
		this.name = name;
	}
}
