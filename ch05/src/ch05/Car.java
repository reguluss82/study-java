package ch05;
//	설계도 차는 차답게 관련 없는 변수 필드 속성 메소드들을 넣지말자
public class Car {
// Member 변수 , 필드  속성을 표현하는 것	
	String	color;	
	int		speed;
// 생성자가 없다 <-본생성자 Car() {}; 자동으로 기 작성된다.
// 클래스의 기능(동작)에 해당하는 구현 부분으로
// 해당 메소드 호출 시 메소드의 블럭( { } )에 해당하는 부분 실행		
	void speedUp() {
		speed++;
		System.out.println(speed+"속도를 올렸다.");
	}
	void speedDown() {
		speed--;
		System.out.println(speed+"속도를 내렸다.");
	}
	void print() {
		System.out.println("색깔: " + color);
		System.out.println("속도: " + speed);
		
	}

}
