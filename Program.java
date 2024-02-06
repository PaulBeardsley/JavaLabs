package railways;

public class Program {

	public static void main(String[] args) {
		
		Train[] trains = {
			new SteamTrain("Thomas", 20, 80, 400, 2000, true, 10, 17),
			new Diesel("Diesel McTrainface", 40, 90, 900, 1200, false, 10),
			new Electric("Meringue Express", 30, 90, 2000, 3000, true, 9)
		};
		//Train plainTrain = new Train("Abbey", 40, 90, 900, 1200, false, 10)
		SteamTrain st = new SteamTrain("Susan", 20, 80, 400, 2000, true, 10, 17);
		//System.out.println(st.getCoalLevel());
		//System.out.println(trains[0].getCoalLevel());
		Train t = new SteamTrain("Thomas", 20, 80, 400, 2000, true, 10, 8);
		//System.out.println(((SteamTrain)t).getCoalLevel());
		//Train te = new Electric("Blancmange", 30, 90, 2000, 3000, true, 9);
		//System.out.println(((SteamTrain)te).getCoalLevel());
		Temp temp = new Temp();
		System.out.println(temp instanceof Train);

		int count = 8;
		while(count > 0) {
			trains[0].accelerate(9);
			for (Train train : trains) {
				System.out.printf("%s %d %d\n",
						train.getName(),
						train.getSpeed(),
						train.getPosition());
				if (train instanceof SteamTrain)
					System.out.println(((SteamTrain)(train)).getCoalLevel());
				train.move();
			}
			System.out.println();
			count--;
		}
	}

}
