package hanoi;

public class TowersOfHanoi
{
	private Tower towerA;
	private Tower towerB;
	private Tower towerC;

	public TowersOfHanoi (int amountOfDisks)
	{
		if (amountOfDisks <= 0) throw new IndexOutOfBoundsException();

		towerA = new Tower();
		towerB = new Tower();
		towerC = new Tower();

		for (int size = amountOfDisks; size > 0; size--)
		{
			towerA.push(new Disk(size));
		}
	}

	Tower towerA ()
	{
		return towerA;
	}

	Tower towerB ()
	{
		return towerB;
	}

	Tower towerC ()
	{
		return towerC;
	}

	private Tower getTower (Column column)
	{
		return column.getTower(this);
	}

	public boolean isSolved ()
	{
		return towerA.isEmpty() && towerB.isEmpty();
	}

	public void solve ()
	{
		_solve(towerA.size(), Column.A, Column.C);
	}

	private void _solve (int amountOfDisks, Column src, Column dest)
	{
		if (amountOfDisks == 1)
		{
			getTower(src).moveTo(getTower(dest));
		}
		else
		{
			Column intermediate = dest.thirdWay(src);
			_solve(amountOfDisks - 1, src, intermediate);
			getTower(src).moveTo(getTower(dest));
			_solve(amountOfDisks - 1, intermediate, dest);
		}
	}
}