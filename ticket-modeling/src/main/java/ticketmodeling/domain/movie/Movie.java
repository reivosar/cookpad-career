package ticketmodeling.domain.movie;

import ticketmodeling.domain.shared.Entity;

public class Movie extends Entity<MovieId, Movie>
{
	final MovieId id;
	final MovieProfile profile;

	public Movie(
		MovieId id,
		MovieProfile profile)
	{
		this.id       = id;
		this.profile  = profile;
	}
}
