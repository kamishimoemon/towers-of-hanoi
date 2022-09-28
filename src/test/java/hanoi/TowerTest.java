package hanoi;

import org.junit.*;
import static org.junit.Assert.*;

public class TowerTest
{
	@Test(expected = EmptyColumn.class)
	public void cannotTakeDisksFromEmptyTower ()
	{
		Tower tower = new Tower();
		tower.pop();
	}

	@Test(expected = MoveMakesNoFuckingSense.class)
	public void movingADiskIntoTheSameColumnMakesNoFuckingSense ()
	{
		Tower tower = new Tower();
		tower.push(new Disk(1));
		tower.moveTo(tower);
	}

	@Test(expected = InvalidMove.class)
	public void disksCannotBePositionedAboveASmallerDisk ()
	{
		Tower towerA = new Tower();
		towerA.push(new Disk(2));

		Tower towerB = new Tower();
		towerB.push(new Disk(1));

		towerA.moveTo(towerB);
	}
}