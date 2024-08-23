package augustcourse;

public class SteamTrain extends Train {
	
	private int coalLevel;
	
	public SteamTrain(
			String name,
			int speedMax,
			int position,
			Track track,
			int coalLevel) {
		super(name, speedMax, position, track);
		this.coalLevel = coalLevel;
	}
	
	public int getCoalLevel() {
		return this.coalLevel;
	}
	
	public void setCoalLevel(int coalLevel) {
		this.coalLevel = coalLevel;
		if(this.coalLevel > 100)
			this.coalLevel = 100;
		else if(this.coalLevel < 0)
			this.coalLevel = 0;
	}
	
	public void chooChoo() {
		System.out.println("Choo Choo!");
	}
	public void clean() {
		System.out.println("Wipe that soot off!");
	}
}
