package robot;

import robot.actions.FireOk;
import robot.actions.FlyNo;
import robot.actions.KnifeWithWood;

public class StandardRobot extends Robot {
	public StandardRobot() {
		fireAction = new FireOk();
		flyAction = new FlyNo();
		knifeAction = new KnifeWithWood();
	}
	

	@Override
	public void shape() {
		System.out.println("달리기가능");

	}

}
