package ch11;

import java.util.ArrayList;

public class CarEx {

	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Car());
		cars.add(new Bus());
		cars.add(new Taxi());
		for (Car car : cars) {
			car.print();
			if (car instanceof Bus)
				((Bus) car).move();
		}
	}
}
