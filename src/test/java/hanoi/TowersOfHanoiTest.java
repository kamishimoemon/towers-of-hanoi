package hanoi;

import org.junit.*;
import static org.junit.Assert.*;

public class TowersOfHanoiTest
{
	@Test
	public void shouldExistsAndAcceptAndIntegerAsOnlyParameter ()
	{
		new TowersOfHanoi(64);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void amountOfDisksCantBeZero ()
	{
		new TowersOfHanoi(0);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void amountOfDisksCantBeNegative ()
	{
		new TowersOfHanoi(-1);
	}

	@Test
	public void aGameWithOneDiskShouldKnowHowToSolveItselfRecursivelyOfCourse ()
	{
		TowersOfHanoi game = new TowersOfHanoi(1);
		assertFalse(game.isSolved());
		game.solve();
		assertTrue(game.isSolved());
	}

	@Test
	public void aGameWithTwoDisksShouldKnowHowToSolveItselfRecursivelyOfCourse ()
	{
		TowersOfHanoi game = new TowersOfHanoi(2);
		assertFalse(game.isSolved());
		game.solve();
		assertTrue(game.isSolved());
	}

	@Test
	public void aGameWithThreeDisksShouldKnowHowToSolveItselfRecursivelyOfCourse ()
	{
		TowersOfHanoi game = new TowersOfHanoi(3);
		assertFalse(game.isSolved());
		game.solve();
		assertTrue(game.isSolved());
	}

	@Test
	public void aGameWithTwelveDisksShouldKnowHowToSolveItselfRecursivelyOfCourse ()
	{
		TowersOfHanoi game = new TowersOfHanoi(12);
		assertFalse(game.isSolved());
		game.solve();
		assertTrue(game.isSolved());
	}
}