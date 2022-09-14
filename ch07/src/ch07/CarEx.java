package ch07;

// 객체가 객체를 참조 Association 관계
public class CarEx {
	String kind; // 알파엔진 / 베타엔진
	// 객체를 member변수 OK 많이 쓰일것이다.
	Engine eg;
	int		kkk = 0; // 디버그 용도
	CarEx(String kind, Engine eg) {
		this.kind = kind;
		this.eg = eg;
	}
		// Debug 프로그램 내부 메모리 구조의 변화 모를때 사용한다, 디버그 방법 확인해보기
	void print() {
		System.out.println("종류 : " + kind);
		kkk++;
		eg.print();
		System.out.println("=============== k ->"+kkk);
	}
	

	public static void main(String[] args) {
		Engine eg1 = new Engine("알파엔진", 2000);
		Engine eg2 = new Engine("베타엔진", 3000);
		// -------------------------------------------
		CarEx[] car = new CarEx[3]; // 배열 안에 객체도 들어가는 것이 가능하다.
		car[0] = new CarEx("모닝", eg1);
		car[1] = new CarEx("소나타", eg1);
		car[2] = new CarEx("그랜져", eg2);
		//				모닝 , 소나타 , 그랜져
		for (CarEx c : car) { // 객체를 배열로 사용 장점
			c.print();
		}
	}

}
