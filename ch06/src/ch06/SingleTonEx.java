package ch06;
	// Design Pattern D/P : 자원절감
	// 정의 : 소프트웨어를 설계할 때 특정 맥락에서 자주 발생하는 고질적인 문제들이 또 발생했을 때 
	//        재사용할 할 수있는 훌륭한 해결책 또는 라이브러리 모음집
	// 가장 유명한 D/P 일반적으로 지칭되는 GOF D/P Gang Of Four
	// - 패턴이란
	// 각기 다른 소프트웨어 모듈이나 기능을 가진 다양한 응용 소프트웨어 시스템들을 개발할 때도 서로 간에 공통되는 설계 문제가 존재하며 이를 처리하는 해결책 사이에도 공통점이 있다. 이러한 유사점을 패턴이라 한다.
	// 패턴은 공통의 언어를 만들어주며 팀원 사이의 의사 소통을 원활하게 해주는 아주 중요한 역할을 한다.
	// 유형
	//	1) 생성  Singleton : 전역 변수를 사용하지 않고 객체를 하나만 생성하도록 하며, 
	//	생성된 객체를 어디에서든지 참조할 수 있도록 하는 패턴
	//	2) 구현 
	//	Adapter  : 한 클래스의 인터페이스를 클라이언트에서 사용하고자 하는 
	//	다른 인터페이스로 변환
	//	Facade : 어떤 소프트웨어의 다른 커다란 코드 부분에 대하여 
	//	간략화된 인터페이스를 제공
	//	3) 행위  
	//	Strategy : 행위를 클래스로 캡슐화해 동적으로 행위를 자유롭게 
	//	바꿀 수 있게 해주는 패턴
	//	Template: 어떤 작업을 처리하는 일부분을 서브 클래스로 캡슐화해 
	//	전체 일을 수행하는 구조는 바꾸지 않으면서 특정 단계에서 
	//	수행하는 내역을 바꾸는 패턴
	// 클래스다이어그램 
	//  싱글톤
	// -싱글톤         -는 private
	// +겟인스턴스     + 는 public
class SingleTon {
	String str;
	private static	SingleTon instance;	// 자신의 클라스를 인스턴스 선언만 해둠				
	//객체가 오직 하나만을 보장하려면 정적(static) 필드를 사용 정적 필드를 사용하면 모든 객체가 공유하는 필드를 만들 수 있으며, 한 번만 생성되고 별도의 메모리 공간에 저장된다는 특징
	private SingleTon() { // 아무나 나를 생성하지 못함 
	}					  
	public static SingleTon getInstance() { // 해당 클래스이므로 가능
		if (instance == null) instance = new SingleTon(); //instance가 없을때 생성자 만들어준다/ 참조변수가 가리키는 객체가 없을 때, 주로 초기값으로 null값을 가진다
		return instance; // st1 instance가 이미 존재하므로 st2 가 호출해도 new X 반환?
	}
}

public class SingleTonEx {

	public static void main(String[] args) {
		SingleTon st1 = SingleTon.getInstance(); // SingleTon.getInstance(); static 이므로 가능
		//SingleTon st2 = new SingleTon.getInstance(); // private 이므로 호출 불가
		SingleTon st2 = SingleTon.getInstance(); // st1 st2 주소가 같다 return instance;
		st1.str = "스스로 있는자";
		System.out.println(st2.str);
		if (st1 == st2 )	System.out.println("같다");
		else				System.out.println("다르다");
	}

}
