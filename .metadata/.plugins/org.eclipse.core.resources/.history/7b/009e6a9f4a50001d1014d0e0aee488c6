package ch05;

public class Car3 {
	String name; // 차 이름
	int inTime; // 입고시간
	int outTime; // 출고시간
	int fee; // 주차요금
	final int AMTPERTIME = 3000; // final 은 상수, 대문자로 입력해라

	Car3(String n, int in, int out) {

		name = n;
		inTime = in;
		outTime = out;
	// Car3 생성자 --> Constructor  class명과 똑같은이름
	// 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당(생성자 목적 멤버 변수 기본값 세팅)
	// 객체초기화 : 필드 초기화 or 메소드 호출하여 객체를 사용할 준비 하는 것
	// 생성자의 이름은 클래스의 이름과 같아야 한다. 
	// 생성자는 리턴값이 없다. (하지만 void를 쓰지 않는다.)
	}

	// void 리턴 값이없음
	void print() {
		int fee = (outTime - inTime) * AMTPERTIME;
		System.out.println("차 이름 :" + name);
		System.out.println("입고시간 :" + inTime);
		System.out.println("출고시간 :" + outTime);
		System.out.println("주차요금 :" + fee);
		System.out.println("-----------------------------");
	}

}
