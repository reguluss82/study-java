package robot;

import robot.actions.FireAction;
import robot.actions.FlyAction;

public abstract class Robot {
	public FireAction fireAction;
	public FlyAction  flyAction;
	
	
	public abstract void shape();
	public void actionBasic() {
		System.out.println("팔다리몸있다");
	}
	
	// 날기기능
	public void actionFly() {
		flyAction.fly();
	}
	// 발사기능
	public void actionFire() {
		fireAction.fire();
	}
	
	

}
