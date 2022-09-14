package ch08;

interface Interfa2 {
	void ifa2();
}
// interface를 interface로 상속 --> extends 확장 //implements 랑 헷갈리지마라
interface Interfa21 extends Interfa2 {
	void ifa21();
}
// interface를 interface로 상속 --> extends //interface는 interface로부터만 상속받을 수 있다
interface Interfa22 extends Interfa21 {
	void ifa22();
}
// interface를 class로 상속 --> implements
class ImplClass2 implements Interfa22 {

//public class 클래스 extends 클래스1 implements 인터페이스1, 인터페이스2 {}
//클래스에서 상속과 구현을 동시에 할 수 있다	
	
	@Override
	public void ifa21() {
		System.out.println("ImplClass2 Interfa21의 메소드");
	}

	@Override
	public void ifa2() {
		System.out.println("ImplClass2 Interfa2의 메소드");
	}

	@Override
	public void ifa22() {
		System.out.println("ImplClass2 Interfa22의 메소드");
	}
	// Interfa2 Interfa21 Interfa22 ImplClass2
}


public class Inter2 {

	public static void main(String[] args) {
		ImplClass2 implClass2 = new ImplClass2();
		implClass2.ifa2();
		implClass2.ifa21();
		implClass2.ifa22();
		System.out.println("-----------Interfa21 interfa21 사용가능 범위------------");
		Interfa21 interfa21 = new ImplClass2(); //조상이 중요하다
		interfa21.ifa21();
		//interfa21.ifa22(); The method ifa22() is undefined for the type Interfa21
	}

}
