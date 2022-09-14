package ch08;
// 인터페이스
// 	1) 일종의 추상클래스. 추상클래스(미완성 설계도)보다 추상화 정도가 높다. 
// 	2) 실제 구현된 것이 전혀 없는 기본 설계도.(알맹이 없는 껍데기) 
// 	3) 추상메서드와 상수만을 멤버로 가질 수 있다. 
// 	4) 인스턴스를 생성할 수 없고, 클래스 작성에 도움을 줄 목적으로 사용된다
// 	5) 미리 정해진 규칙에 맞게 구현하도록 표준을 제시하는 데 사용된다
// 	6) class’대신 ‘interface’를 사용한다는 것 외에는 클래스 작성과 동일하다
//  7) 다중상속의 효과를 냄 (클래스는 불가능, 인터페이스는가능) 
//  추상메소드만 선언 가능했지만 Java8부터 default method 선언 가능
public interface Inter1 {
	// 모든 멤버변수는 public Static Final 이어야 함 생략가능
	// 모든 메소드는 public abstract 이어야 함 생략가능
	// Static Final 상수
	int AAA = 3;
	// Abstract methods 추상 메소드
	void display();
	void print();
}
//Interface 상속받으면 method 구현해야한다 <-인터페이스는 메모리에 올릴수없다. class 는 메모리를 할당받야아 하므로 직접 method overRiding 하여야 함
class ImplClass1 implements Inter1 {

	@Override
	public void display() {
		// AAA++;  <- The final field Inter1.AAA cannot be assigned 변수가 아니라 상수이므로 에러.
		System.out.println("재정의 했으..AAA=>"+AAA);
		
	}

	@Override
	public void print() {
		System.out.println("Interface 상속받아 구현");
		
	}
	
}
