package robot;

import robot.actions.FireNo;
import robot.actions.FlyNo;
import robot.actions.KnifeNo;

public class CheapRobot extends Robot {
	public CheapRobot() {
		fireAction = new FireNo();
		flyAction = new FlyNo();
		knifeAction = new KnifeNo();
		
	}

	@Override
	public void shape() {
		System.out.println("걷기가능");
	}
	
}
