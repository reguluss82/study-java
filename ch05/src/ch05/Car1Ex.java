package ch05;

//설계도 , public class Car1 불가능 한 파일내 public class 하나.(파일명 Car1Ex.java)
class Car1 {
	String color; // Member 변수 , 필드 속성을 표현하는 것
	int speed; // int 값은 정해두지 않으면 자동으로 초기화 된다
	// *** static 변수는  동일 클래스 내의 모든 인스턴스들이 공유하는 변수 **Instance 생성 전 사용 가능
	static int wheel;

	void speedUp() {
		speed++;
		System.out.println(speed + "속도를 올렸다.");
	}

	void print() {
		System.out.println("색깔: " + color);
		System.out.println("속도: " + speed);
		System.out.println("바퀴: " + wheel);
	}

}

public class Car1Ex {

	public static void main(String[] args) {
//		public static void main(String [] args){}  메인메소드
//		이 메소드는 특별한 메소드로 정해져 있는 메소드이고 java 컴파일러나실행하는 넘은 이런 메소드를 맨처음 찾게 정의 되어 있음.
//		여기서  String [] args 는 스트링타입의 배열인 args 를 선언한것으로서 자바를 실행시에 넣는 인수값을 받습니다.   
//		고로 실행시에 java 클레스이름 a,b,c...하게 되면
//		args[0] = "a"; args[1] = "b";.. 이런식으로 들어가게 됩니다.
		
		Car1.wheel = 8; // UFO  // static 변수는 Instance 생성 전 사용 가능
		System.out.println("UFO wheel: " + Car1.wheel);

		// 선언
		Car1 c1 = new Car1(); // c1이라는 메모리 주소가 생성
		Car1 c2 = new Car1();

		c1.color = "빨강"; // 메모리 생성된 곳에 값을 넣어
		c1.speed = 200;
		// c1.wheel = 4;
		c2.color = "노랑";
		// c2.wheel = 3;

		c1.print();
		c2.print();

	}

}
