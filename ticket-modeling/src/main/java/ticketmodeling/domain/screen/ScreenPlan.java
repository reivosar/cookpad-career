package ticketmodeling.domain.screen;

import ticketmodeling.domain.movie.MovieId;
import ticketmodeling.domain.schedule.ScheduledTime;
import ticketmodeling.domain.shared.Entity;

public class ScreenPlan extends Entity<ScreenId, ScreenPlan>
{
	final ScreenId screenId;
	final MovieId movieId;
	final ScheduledTime schedule;

	public ScreenPlan(
		ScreenId screenId,
		MovieId movieId,
		ScheduledTime schedule)
	{
		this.screenId = screenId;
		this.movieId  = movieId;
		this.schedule = schedule;
	}
}
