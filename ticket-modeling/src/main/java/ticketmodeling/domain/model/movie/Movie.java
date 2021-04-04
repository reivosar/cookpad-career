package ticketmodeling.domain.model.movie;

import reivosar.common.util.model.Entity;

public class Movie extends Entity<MovieId, Movie>
{
	final MovieId id;
	final MovieProfile profile;

	public Movie(
		final MovieId id,
		final MovieProfile profile)
	{
		this.id       = id;
		this.profile  = profile;
	}

	@Override
	public MovieId publicId() {
		return id;
	}
}
