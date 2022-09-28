package hanoi;

public class Disk
{
	private int size;

	public Disk (int size)
	{
		this.size = size;
	}

	private boolean isSmaller (Disk anotherDisk)
	{
		return size < anotherDisk.size;
	}

	private boolean isBigger (Disk anotherDisk)
	{
		return size > anotherDisk.size;
	}

	void checkIfCanBePutOnTopOf (Disk anotherDisk)
	{
		if (this.isBigger(anotherDisk)) throw new InvalidMove();
	}
}