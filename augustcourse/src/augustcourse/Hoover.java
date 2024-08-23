package augustcourse;

public class Hoover implements Vacuumable {
	private boolean power;
	private int strength;
	
	public void vacuumStuff() {
		System.out.println("Sucking up the dust, cobwebs, hair etc.");
	}
	public void reach() {
		System.out.println("You won't believe where I am now!");
	}
	public void toggleSwitch() {
		this.power = !this.power;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getStrength() {
		return this.strength;
	}
	public boolean isPowerOn() {
		return this.power;
	}
}
