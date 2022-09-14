package ch05;
//실행 class 는 main method가 존재해야 한다.
public class CarEx {

	public static void main(String[] args) {
		// 선언		   생성  //선언과 동시에 생성
		Car myCar = new Car();  //메모리가 생성되어 myCar(istance)에 class Car(속성,method) 가져옴 (메모리에 초기화)
		myCar.color = "빨강";
		myCar.speed = 200;
		myCar.speedUp();
		myCar.print();
		// 1.선언			//선언 후 생성
		Car yourCar;
		yourCar = new Car();		// 생성
		yourCar.color = "초록";
		yourCar.speed = 150;
		yourCar.print();
		yourCar.speedUp();
		
	}

}
