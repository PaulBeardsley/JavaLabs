package augustcourse;

public class Track {
	private int trackLength;
	private int voltage;
	
	private static int speedLimit = 90;
	
	public Track(int trackLength) {
		this(trackLength, 0);
	}
	
	public Track(int trackLength, int voltage) {
		this.trackLength = trackLength;
		this.voltage = voltage;
	}
	
	public static int getSpeedLimit() {
		return speedLimit;
	}
	
	public static void setSpeedLimit(int speedLimit) {
		Track.speedLimit = speedLimit;
		// send email to minister of transport
		// saying you have changed the speed limit
	}
	
	public int getTrackLength() {
		return this.trackLength;
	}
	
	public int getVoltage() {
		return this.voltage;
	}
}
