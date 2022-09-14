package robot;

import robot.actions.FireAction;
import robot.actions.FlyAction;
import robot.actions.KnifeAction;

public abstract class Robot {
	public FireAction	fireAction;
	public FlyAction	flyAction;
	public KnifeAction	knifeAction;
	
	public Robot() {
		
	}
	public abstract void shape();
	
	public void actionBasic() {
		System.out.println("팔다리몸통존재");
	}
	//미사일 기능
	public void actionFire() {
		fireAction.fire();
	}
	//비행 기능
	public void actionFly() {
		flyAction.fly();
	}
	//칼 기능
	public void actionKnife() {
		knifeAction.knife();
	}
	
	public void setFireAction(FireAction fireAction) {
		this.fireAction = fireAction;
	}
	public void setFlyAction(FlyAction flyAction) {
		this.flyAction = flyAction;
	}
	public void setKnifeAction(KnifeAction knifeAction) {
		this.knifeAction = knifeAction;
	}

}
