package hanoi;

public abstract class Column
{
	public abstract Tower getTower (TowersOfHanoi game);
	public abstract Column thirdWay (Column second);
	protected abstract Column notA ();
	protected abstract Column notB ();
	protected abstract Column notC ();

	public static final Column A = new Column () {
		public Tower getTower (TowersOfHanoi game) {
			return game.towerA();
		}
		public Column thirdWay (Column second) {
			return second.notA();
		}
		protected Column notA () {
			throw new RuntimeException("This should never happen =)");
		}
		protected Column notB () {
			return Column.C;
		}
		protected Column notC () {
			return Column.B;
		}
	};

	public static final Column B = new Column () {
		public Tower getTower (TowersOfHanoi game) {
			return game.towerB();
		}
		public Column thirdWay (Column second) {
			return second.notB();
		}
		protected Column notA () {
			return Column.C;
		}
		protected Column notB () {
			throw new RuntimeException("This should never happen =)");
		}
		protected Column notC () {
			return Column.A;
		}
	};

	public static final Column C = new Column () {
		public Tower getTower (TowersOfHanoi game) {
			return game.towerC();
		}
		public Column thirdWay (Column second) {
			return second.notC();
		}
		protected Column notA () {
			return Column.B;
		}
		protected Column notB () {
			return Column.A;
		}
		protected Column notC () {
			throw new RuntimeException("This should never happen =)");
		}
	};
}