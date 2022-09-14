
// 디자인: 전략 (strategy) 패턴
//	객체가 할 수 있는 행위들 각각을 전략으로 만들어 놓고 (캡슐화 하는 인터페이스 정의),
//	동적으로 행위의 수정이 필요한 경우 전략을 바꾸는 것 만으로 행위의 수정이 가능하도록 만든 패턴
//	즉, 동일한 문제를 다른 알고리즘(전략)으로 쉽게 바꾸며 해결할 수 있도록 하는 디자인 패턴
// 캡슐화
//	필요한 속성(attribute)와 행위(method)를 하나로 묶고 그 중 일부를 외부에서 사용하지 못하도록 은닉하는 것
// OCP (open-closed-principle)
//	개방 폐쇄 원칙 : 소프트웨어 개체(클래스, 모듈, 함수)는 확장에 대해 열려있어야 하고, 수정에 대해서는 닫혀 있어야 함
//	abtraction을 통한 inversion을 통해 소스코드를 변경하지 않고 그 모듈의 행위를 바꾸는 일이 가능
// 자바의 인터페이스(interface)와 추상클래스(abstract class)
//	모듈을 고정된 추상화에 의존하면 해당 모듈은 수정에 대해 닫혀 있는 것이 가능하게 됨
//	해당 모듈의 행위는 추상화의 새 파생 클래스를 만듦으로써 확장에 대해 열려있게 됨
// 전략패턴 사용의 예시
//	OCP 위반
//		client 객체가 새로운 server 객체를 사용하도록 바꾸고 싶다면, 
//		client 클래스를 수정하여 다른 server 클래스를 사용하도록 바꿔야 함 
//		-> 수정에 대하여 닫혀있어야하는 OCP 위반
//	해결책
//		스트레티지 패턴의 사용: 
//		확장이 필요한 부분에 abstraction추상화를 적용하여 상위모듈이 고정된 추상화에 의존하도록
//		-> 만약 새로운 server객체를 사용하고 싶다면 client interface를 구현한 새로운 클래스를 추가하면 됨
package robot;

import robot.actions.FireAction;	// 다른 패키지라서 import해야함. 자동완성 기능사용하면 자동 import
import robot.actions.FlyAction;  
import robot.actions.KnifeAction;

public abstract class Robot {
	
	public FlyAction   flyAction;  // 부품화 되어지는 Interface를 멤버 변수로 선언
	public FireAction  fireAction;
	public KnifeAction knifeAction;
	
	public Robot() {
		
	}
	public abstract void shape();
	
	public void actionBasic() {
		System.out.println("팔, 다리, 머리, 몸통 존재.");
	}
	// 비행 기능
	public void actionFly() {
		flyAction.fly();
	}
	// 미사일 기능
	public void actionFire() {
		fireAction.fire();
	}
	// 칼 기능
	public void actionKnife() {
		knifeAction.knife();
	}
	
	
	
	
	// Setter 굳이만들필요는 없
	public void setFlyAction(FlyAction flyAction) {
		this.flyAction = flyAction;
	}
	public void setFireAction(FireAction fireAction) {
		this.fireAction = fireAction;
	}
	public void setKnifeAction(KnifeAction knifeAction) {
		this.knifeAction = knifeAction;
	}
	
}
