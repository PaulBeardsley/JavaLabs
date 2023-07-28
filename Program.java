public class Program {
	public static void main(String[] args) {

		Car myCar = new Car("Seat Ibiza", 30, 90, 10);
		Car yourCar = new Car("Toyota", 0, 120, 12);

		System.out.println(myCar.getSpeed());
		System.out.println(myCar.getMake());
		System.out.println(yourCar.getSpeed());
		System.out.println(yourCar.getMake());
		yourCar.accelerate(9);
		System.out.println(yourCar.getSpeed());
		yourCar.brake();
		System.out.println(yourCar.getSpeed());
		
		BondCar bc = new BondCar("Aston Martin", 90, 200, 60);
		System.out.println(bc.getMake());
		System.out.println(bc.getSpeed());
		bc.launchMissile();
		bc.launchMissile();
		bc.launchMissile();
		bc.launchMissile();
		bc.launchMissile();
		bc.launchMissile();
		bc.launchMissile();

	}
}
class Car {
	private String make;
	private int speed;
	private int maxAcc;
	private int maxSpeed;
	private boolean airCon;
	
	public Car(String make, int speed, int maxSpeed, int maxAcc) {
		this.maxAcc = maxAcc;
		this.maxSpeed = maxSpeed;
		this.make = make;
		this.speed = speed;
	}
	
	public void accelerate(int amount) {
		if(amount > this.maxAcc)
			this.speed += this.maxAcc;
		else
			this.speed += amount;
		if(this.speed > this.maxSpeed)
			this.speed = this.maxSpeed;
	}
	public void brake(int amount) {
		this.speed -= amount;
		if(this.speed < 0)
			this.speed = 0;
	}
	public void brake() {
		this.speed -= 50;
		if(this.speed < 0)
			this.speed = 0;
	}
		
	public int getSpeed() {
		return this.speed;
	}
	public String getMake() {
		return this.make;
	}
	public void setAirCon(boolean onState) {
		if(onState) {
			if(this.airCon) {
				System.out.println("It's already on!");
			}
			else {
				System.out.println("Switching it on now.");
				this.airCon = true;
			}
		}
		else {
			if(this.airCon) {
				System.out.println("Switching off now.");
				this.airCon = false;
			}
			else {
				System.out.println("Already off.");
			}
		}
	}
}
class BondCar extends Car {
	private int howManyMissiles;
	
	public BondCar(String make, int speed, int maxSpeed, int maxAcc, int howManyMissiles) {
		super(make, speed, maxSpeed, maxAcc);
		this.howManyMissiles = howManyMissiles;
	}
	public BondCar(String make, int speed, int maxSpeed, int maxAcc) {
		this(make, speed, maxSpeed, maxAcc, 6);
	}
	
	public void launchMissile() {
		if(howManyMissiles > 0) {
			howManyMissiles--;
			System.out.println("Missile launched... KERBOOM!");
		}
		else {
			System.out.println("Out of missiles, James.");
		}
	}
}
