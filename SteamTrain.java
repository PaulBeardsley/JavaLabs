package railways;

public class SteamTrain extends Train {

	private int coalLevel;
	
	public SteamTrain(String name,
			int speed,
			int topSpeed,
			int position,
			int trackLength,
			boolean forward,
			int maxAcceleration,
			int coalLevel) {
		super(name, speed, topSpeed, position, trackLength, forward, maxAcceleration);
		this.coalLevel = coalLevel;
	}

	public SteamTrain(String name,
			int speed,
			int topSpeed,
			int position,
			int trackLength) {
		this(name, speed, topSpeed, position, trackLength, true, 5, 20);
		// TODO Auto-generated constructor stub
	}
	
	public void whistle() {
		System.out.println("Toot tooooooot!");
	}
	
	public void refuel() {
		this.coalLevel = 20;
	}
	public int getCoalLevel() {
		return this.coalLevel;
	}

}
