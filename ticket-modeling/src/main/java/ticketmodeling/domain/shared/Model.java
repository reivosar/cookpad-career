package ticketmodeling.domain.shared;

abstract class Model
{
	@Override
	public abstract boolean equals(Object obj);
	@Override
	public abstract int hashCode();
	@Override
	public abstract String toString();
}
