package augustcourse;

public class ElectricTrain extends Train {

	private boolean brushesAreClean;
	
	public ElectricTrain(
			String name,
			int speedMax,
			int position,
			Track track,
			boolean brushesAreClean) {
		super(name, speedMax, position, track);
		this.brushesAreClean = brushesAreClean;
	}
	
	public void zap() {
		System.out.println("Sparks fly!");
	}
	public void clean() {
		System.out.println("Keep those brushes shiny!");
	}
	//@Override
	public void checkTickets(int i) {
		System.out.printf("%d tickets to check.\n");
	}
	@Override
	public void checkTickets() {
		System.out.println("Please show your electronic tickets.");
		super.checkTickets();
	}
}
