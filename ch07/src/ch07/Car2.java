package ch07;

// 				OverLoading								OverRiding
//	정의		같은 Class여러개 동일이름 method		다른 Class 상속
//	유형		생성자/Method OverLoading				extends / implement
//	특징		호출에 따라 Type/변수Count 자동대응		method->내꺼 , 변수->부모꺼
public class Car2 {
	int a = 7;
	void move() {
		System.out.println("차 이동...");
	}

} // overRiding overLoading 설명할 수 있어야 한다.
  // 부모클래스 Ca2 로부터 move 메소드 상속 <- overRiding  (r이 2개니까 대문자 써주자)
class Bus extends Car2 {
	int	a = 25;
	// overRiding
	void move() {
		System.out.println("40명 태우고 이동");
	}
	
}

class Ambulance extends Car2 {
	int a = 100;
	void move() {
		System.out.println("사이렌 울리며 이동");
	}
	void special() {
		System.out.println("환자를 태우고 있다");
	}
}

class FireEngine extends Car2 {
	int a = 11;
	void move() {
		System.out.println("물뿌리면서 이동");
	}
}
