package augustcourse;

public abstract class Train {
	private String name;
	private int speedMax = 50;
	private int position;
	private Track track;	// dependency
	
	
	
	public Train(String name, int speedMax, int position, Track track) {
		this.name = name;
		this.speedMax = speedMax;
		this.position = position;
		this.track = track;
	}
	
	public void checkTickets() {
		System.out.println("Tickets please from Train!");
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSpeedMax() {
		return this.speedMax;
	}
	
	public int getPosition() {
		return this.position;
	}
	
	public int getTrackLength() {
		return this.track.getTrackLength();
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public void move(int distance) {
		// Check distance is not more than speed allows
		if(distance >= 0) {
			if(distance > this.speedMax)
				distance = this.speedMax;
		}
		else {
			if(Math.abs(distance) > this.speedMax)
				distance = this.speedMax * (-1);
		}
		this.position += distance;
		
		// Check train is still on track
		if(this.position > this.track.getTrackLength())
			this.position = this.track.getTrackLength();
		else if(this.position < 0)
			this.position = 0;
	}
	
	public abstract void clean();
}
