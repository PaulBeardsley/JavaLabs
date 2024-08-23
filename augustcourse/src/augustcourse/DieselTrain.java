package augustcourse;

public class DieselTrain extends Train {
	public DieselTrain(
			String name,
			int speedMax,
			int position,
			Track track
			) {
		super(name, speedMax, position, track);
	}
	public void clean() {
		System.out.println("Cleaning this here diesel.");
	}
}
