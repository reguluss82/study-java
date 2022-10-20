package ch07;
//상속 자식클래스 super

class Parent {
	int			a = 7;
	int			b = 7;
	void display() {
		System.out.println("Parent 대박 ");
	}
	void print() {
		System.out.println("Parent 난 부모 print 메소드");
	}
}

class Child extends Parent {
	int			a = 10 ;
	void print() {
		super.print(); // 1 부모 print 메소드
		System.out.println("Child 부모멤버 	     a = " +super.a); //super.a -> 부모클래스 a
		System.out.println("Child 난 자식 메소드 a = " +a);  //기본적으로 자식클래스 필드 사용 -> 자식클래스 a /This.가 생략된것으로 봄
		System.out.println("Child 난 자식 메소드 b = " +b); // 자식클래스에 b 없음 -> 부모클래스 b /This.가 생략된것으로 봄
		System.out.println("====================");
	}
}

public class Super1 {

	public static void main(String[] args) {
		Child child = new Child();
		child.print();
		child.display();

	}

}
