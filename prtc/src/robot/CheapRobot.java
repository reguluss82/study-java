package robot;

import robot.actions.FireNo;
import robot.actions.FlyNo;

public class CheapRobot extends Robot {
	public CheapRobot() {
		flyAction = new FlyNo();
		fireAction = new FireNo();
	}

	@Override
	public void shape() {
		System.out.println("걷기가능");
	}

}
