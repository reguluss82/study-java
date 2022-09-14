package robot;

import robot.actions.FireNo;
import robot.actions.FlyNo;
import robot.actions.KnifeNo;

public class CheapRobot extends Robot {

	public CheapRobot() {
		flyAction   = new FlyNo();
		fireAction  = new FireNo();
		knifeAction = new KnifeNo();
		//fireAction = new FireOK();// 인터페이스 : Class 부품화 가능하다
	}
	
	@Override
	public void shape() {
		System.out.println("걸을 수 있습니다.");
	}

}
