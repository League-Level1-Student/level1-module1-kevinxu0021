
public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */

		// 1. Create a RaceCar and place it in 5th position
		RaceCar raceCar = new RaceCar("Ford", 15);
		// 2. Print the RaceCar's position in the race
		raceCar.getPositionInRace();
		// 3. Crash the RaceCar
		raceCar.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		if (raceCar.damaged = true) {
			raceCar.pit();
		}
		// 5. Help the car move into first place.
		int place = raceCar.getPositionInRace();
		for (int i = 1; i < place; i++) {
			raceCar.overtake();
		}
	}
}
