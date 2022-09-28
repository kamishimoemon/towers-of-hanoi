package hanoi;

import java.util.*;

public class Tower
{
	private Stack<Disk> disks;

	public Tower ()
	{
		disks = new Stack<>();
	}

	boolean isEmpty ()
	{
		return disks.empty();
	}

	Disk peek ()
	{
		return disks.peek();
	}

	void push (Disk disk)
	{
		disks.push(disk);
	}

	Disk pop ()
	{
		if (isEmpty()) throw new EmptyColumn();

		return disks.pop();
	}

	int size ()
	{
		return disks.size();
	}

	public void moveTo (Tower dest)
	{
		Tower src = this;

		if (src == dest) throw new MoveMakesNoFuckingSense();

		if (!src.isEmpty() && !dest.isEmpty()) src.peek().checkIfCanBePutOnTopOf(dest.peek());

		dest.push(src.pop());
	}
}