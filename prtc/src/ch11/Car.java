package ch11;

public class Car {
	void print() {
		System.out.println("난 차야");
	}

}

class Bus extends Car {
	void print() {
		System.out.println("난 버스야");
	}
	void move() {
		System.out.println("승객 40명");
	}
}

class Taxi extends Car {
	void print() {
		System.out.println("난 택시야");
	}
}
