package ticketmodeling.domain.model.schedule;

import reivosar.common.domain.model.Entity;
import ticketmodeling.domain.model.movie.MovieId;
import ticketmodeling.domain.model.screen.ScreenId;

public class Schedule extends Entity<ScheduleId, Schedule>
{
	final ScheduleId scheduleId;
	final ScheduledTime scheduledTime;
	final ScreenId screenId;
	final MovieId movieId;

	public Schedule(
		final ScheduleId scheduleId,
		final ScheduledTime scheduledTime,
		final ScreenId screenId,
		final MovieId movieId)
	{
		this.scheduleId    = scheduleId;
		this.scheduledTime = scheduledTime;
		this.screenId      = screenId;
		this.movieId       = movieId;
	}

	@Override
	public ScheduleId publicId() {
		return scheduleId;
	}

	public ScheduledTime time() {
		return scheduledTime;
	}
}
