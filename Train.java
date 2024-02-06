package railways;

public abstract class Train {
	private String name;
	private int speed;
	private int topSpeed;
	private int position;
	private int trackLength;
	private boolean forward;
	private int maxAcceleration;
	private static int speedLimit = 70;
	
	public Train(String name,
			int speed,
			int topSpeed,
			int position,
			int trackLength,
			boolean forward,
			int maxAcceleration) {
		this.name = name;
		this.topSpeed = topSpeed;
		if(speed > this.topSpeed)
			this.speed = this.topSpeed;
		else
			this.speed = speed;
		this.position = position;
		this.trackLength = trackLength;
		this.forward = forward;
		this.maxAcceleration = maxAcceleration;
	}
	public Train(String name,
			int speed,
			int topSpeed,
			int position,
			int trackLength
			) {
		this(name, speed, topSpeed, position, trackLength, true, 10);
	}
	public String getName() {
		return this.name;
	}
	public void setSpeed(int speed) {
		if(speed > this.topSpeed)
			this.speed = this.topSpeed;
		else
			this.speed = speed;
	}
	public void reverse() {
		if (this.speed == 0)
			this.forward = !this.forward;
	}
	public int getSpeed() {
		return this.speed;
	}
	public int topSpeed() {
		return this.topSpeed;
	}
	public int getPosition() {
		return this.position;
	}
	public void setPosition(int position) {
		if(position < 0) {
			this.position = 0;
			return;
		}
		if(position <= this.trackLength)
			this.position = position;
		else
			this.position = this.trackLength;
	}
	public int getTrackLength() {
		return this.trackLength;
	}
	public boolean isForward() {
		return this.forward;
	}
	public void accelerate(int amount) {
		if(amount > this.maxAcceleration) {
			amount = this.maxAcceleration;
		}
		this.setSpeed(this.getSpeed() + amount);
	}
	public void move() {
		if(this.forward)
			this.setPosition(this.position + this.speed);
		else
			this.setPosition(this.position - this.speed);
	}
	
}
