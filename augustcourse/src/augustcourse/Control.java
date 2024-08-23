package augustcourse;

public class Control extends Object {

	public static void main(String[] args) {
		
		Track trA = new Track(2000);
		Track trB = new Track(2000);
		Track trC = new Track(8000, 10000);
		
		Train t1 = new SteamTrain("Thomas", 50, 1990, trA, 70);
		Train t2 = new ElectricTrain("James", 60, 10, trB, true);

		t2.checkTickets();

		
		/*Train[] myTrains = {
				//new Train("Thomas", 50, 1990, trA),
				//new Train("James", 60, 10, trB),
				new Train("Tara", 70, 1500, trC),
				new SteamTrain("Gordon", 30, 4000, trC, 60),
				new ElectricTrain("Eliza", 100, 0, trC, true),
				new SteamTrain("Sharon", 35, 500, trA, 70),
				new ElectricTrain("Kevin", 95, 700, trC, true),
				new DieselTrain("Moonshine", 60, 900, trB)
		};
		
		//SteamTrain st1 = new SteamTrain("Gordon", 30, 4000, trC, 60);
		
		for (Train myTrain : myTrains) {
			myTrain.move(20);
			System.out.printf("%s is at position %d.\n",
					myTrain.getName(), myTrain.getPosition());
			myTrain.clean();
			if(myTrain instanceof SteamTrain)
				((SteamTrain)myTrain).chooChoo();
			else if(myTrain instanceof ElectricTrain)
				((ElectricTrain)myTrain).zap();
		}*/
	}
}
