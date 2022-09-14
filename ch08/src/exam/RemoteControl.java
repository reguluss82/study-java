package exam;
// default method
// 	default method는 인터페이스에 있는 구현 메서드를 의미합니다.
// 	메서드 앞에 default 예약어를 붙인다.
// 	구현부 {} 가 있어야 한다.

// 사용하는 이유
// 	기존에 존재하던 인터페이스를 이용하여서 구현된 클래스를 만들고 사용하고 있는데  
// 	인터페이스를 보완하는 과정에서 추가적으로 구현해야 할 혹은 필수적으로 존재해야 할 메소드가 있다면,
// 	이미 이 인터페이스를 구현한 클래스와의 호환성이 떨어 지게 됩니다.
// 	이러한 경우 default 메소드를 추가하게 된다면 하위 호환성은 유지되고 인터페이스의 보완을 진행 할 수 있습니다.

// 개방-폐쇄 원칙 (Open/closed principle) : “소프트웨어 요소는 확장에는 열려 있으나 변경에는 닫혀 있어야 한다.”

// default method 간 충돌
//	default method를 사용하면 크게 2가지 충돌 상황이 발생할 수 있습니다.
//		1)여러 인터페이스의 디폴트 메서드 간의 충돌
//		2)디폴트 메서드와 상위 클래스의 메서드 간의 충돌
//	default method는 인터페이스를 구현한 클래스에서 코드를 구현할 필요가 없을 뿐이지, 구현을 할 수 없는 것이 아닙니다.
//	즉, 인터페이스를 구현하는 클래스에서 default method를 재정의할 수 있습니다.
//	따라서, 위와 같은 충돌 상황이 일어나는 클래스에서 defalt method를 재정의하면 충돌 상황을 해결할 수 있습니다.


public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드 인터페이스 임에도 불구하고 실행된다(인터페이스에서x 구현객체가 있어야함)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드 
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
