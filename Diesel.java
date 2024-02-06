package railways;

public class Diesel extends Train {

	public Diesel(String name, int speed, int topSpeed, int position, int trackLength, boolean forward, int maxAcceleration) {
		super(name, speed, topSpeed, position, trackLength, forward, maxAcceleration);
		// TODO Auto-generated constructor stub
	}

	public Diesel(String name, int speed, int topSpeed, int position, int trackLength) {
		super(name, speed, topSpeed, position, trackLength);
		// TODO Auto-generated constructor stub
	}
	public boolean checkDieselColour() {
		System.out.println("Checking diesel colour in tank.");
		return true;
	}

}
