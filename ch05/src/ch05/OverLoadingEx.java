package ch05;

class OverLoading {
	String name;
	int age;
	String gender;

	// OverLoading 하나의 클래스 안에 똑같은 이름의 메소드가 존재하는 것
	// 생성자 OverLoading (메소드도 가능)
	OverLoading() {
	}

	OverLoading(int a) {
		age = a;
	}

	OverLoading(String str) {
		name = str;
	}

	void print() {
		System.out.println("---------------");
		System.out.println("name->" + name);
		System.out.println("age->" + age);
	}
}

public class OverLoadingEx {

	public static void main(String[] args) {
		OverLoading ov1 = new OverLoading(); // 아무것도 없는 경우
		OverLoading ov2 = new OverLoading(25); // int 들어온 경우
		OverLoading ov3 = new OverLoading("홍길동"); // String이 들어온 경우
		ov1.print(); //결과 값을 보면 name null age 0 
		ov2.print();
		ov3.print(); //결과 값을 보면 age 0 정해두지않으면 0
		//	아무 것도 없는 것을 나타내는 자바의 keyword
		//	참조형 타입(객체와 배열의 참조변수)의 기본값
		//	참조변수가 가리키는 객체가 없을 때, 주로 초기값으로 null값을 가진다. 
		//	참조변수가 지역변수로 선언된 경우 선언과 동시에 초기화되어야 하기 때문에, 
		//	선언할 때 참조변수가 가리킬 객체의 주소가 결정되지 않았다면 null로 초기화 하는 것 같다.
	}

}
