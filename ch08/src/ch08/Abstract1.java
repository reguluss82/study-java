package ch08;
// 추상클래스			// Interface 와 추상Class 비교 ***면접 단골 손님 /선언,상속,장점 등 비교
// 추상 클래스와 추상 메소드
//	- 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다. 
//	- 코드의 복잡성을 줄일 수 있다(캡슐화)
// 변수 , 메소드 포함
// 하나 이상의 추상 메소드가 존재 해야 함

abstract class AbsClass { //
	// 변수 , 메소드 포함
	int kkk = 0;
	public void setKkk(int kkk) {
		this.kkk = kkk;
	}
	public AbsClass() {
		System.out.println("추상Class 생성자");
		
	}
	
	abstract void print();	// 하나이상의 추상 메소드가 존재 해야 함
	// 1) 선언부만 있고 구현부(몸통, body)가 없는 메서드
	// 2) 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우에 사용
	// 3) 추상클래스를 상속받는 자손클래스에서 추상메서드의 구현부를 완성(재정의하여 완성)
}
class ImplAbsClass extends AbsClass {
	// 추상메소드를 상속 받으면 must --> 추상메서드의 구현부를 완성
	@Override
	void print() {
		System.out.println("ImplAbsClass kkk-->"+kkk);
	}
	
}



public class Abstract1 {

	public static void main(String[] args) {
		// 추상 Class는 instance 생성 안됨
		// AbsClass absClass = new AbsClass //인터페이스는 구현하지 못한다. 추상메소드 때문
		AbsClass absClass = new ImplAbsClass();
		absClass.setKkk(12);
		absClass.print();
	}

}
