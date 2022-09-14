package ch07;
// 상속 - 매개변수 유무, 타입 에 따른 생성자 호출 차이
class Parent1 {
	Parent1() {
		System.out.println("매개변수 없는 부모 생성자");
	}
	Parent1(String str) {
		System.out.println("Parent 매개변수 있는 부모 생성자 1 str-->" + str);
	}
	void parentPrint() {
		System.out.println("parentPrint 야호! 월요일이다");
		
	}
}

class child1 extends Parent1 {
	child1() {
		 //super("헐~~");		// 매개변수 1개 짜리 부모 생성자 호출 / 주석 삭제 해서 실행 후 있는거 없는거 비교
		 					// 
		System.out.println("매개변수 없는 자식 생성자");
		// super("헐~~");		// 매개변수 1개 짜리 부모 생성자 호출 --> 오류 : super 생성자 호출은 생성자 첫줄에 위치해야함
	}
	void childCc1() {
		System.out.println("cc1 야호! 월요일이다");
	}
	void childCc2() {
		System.out.println("cc2 자식 Method cc2 ");
	}
}

public class Super2 {

	public static void main(String[] args) {
		child1 child1 = new child1();
		child1.childCc2();
		child1.childCc1();
		// child1.super.cc1();

	}

}
