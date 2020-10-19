package ticketmodeling.domain.schedule;

import ticketmodeling.common.domain.shared.Entity;
import ticketmodeling.domain.movie.MovieId;

public class Schedule extends Entity<ScheduleId, Schedule>
{
	final ScheduleId scheduleId;
	final ScheduledTime scheduledTime;
	final MovieId movieId;

	public Schedule(
		ScheduleId scheduleId,
		ScheduledTime scheduledTime,
		MovieId movieId)
	{
		this.scheduleId    = scheduleId;
		this.scheduledTime = scheduledTime;
		this.movieId       = movieId;
	}
}
