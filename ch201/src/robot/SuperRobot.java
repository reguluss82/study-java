package robot;

import robot.actions.FireOk;
import robot.actions.FlyOk;
import robot.actions.KnifeWithLazer;

public class SuperRobot extends Robot {
	public SuperRobot() {
		fireAction = new FireOk();
		flyAction = new FlyOk();
		knifeAction  =new KnifeWithLazer();
	}
	
	@Override
	public void shape() {
		System.out.println("날기가능");

	}

}
