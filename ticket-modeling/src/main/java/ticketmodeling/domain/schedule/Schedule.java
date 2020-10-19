package ticketmodeling.domain.schedule;

import ticketmodeling.common.domain.shared.Entity;
import ticketmodeling.domain.movie.MovieId;
import ticketmodeling.domain.screen.ScreenId;

public class Schedule extends Entity<ScheduleId, Schedule>
{
	final ScheduleId scheduleId;
	final ScheduledTime scheduledTime;
	final ScreenId screenId;
	final MovieId movieId;

	public Schedule(
		ScheduleId scheduleId,
		ScheduledTime scheduledTime,
		ScreenId screenId,
		MovieId movieId)
	{
		this.scheduleId    = scheduleId;
		this.scheduledTime = scheduledTime;
		this.screenId      = screenId;
		this.movieId       = movieId;
	}
}
