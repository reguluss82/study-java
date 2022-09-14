package ch08;

public class RobotEx {

	static void action(Robot r) {
		if( r instanceof DanseRobot) {
			((DanseRobot)r).dance();
		} else if( r instanceof DrawRobot) {
			((DrawRobot)r).draw();
		} else {
			//((SingRobot)r).sing();
			SingRobot sr = (SingRobot) r;
			sr.sing(); 
		}
	}
	
	public static void main(String[] args) {
		Robot[] rb = new Robot[3];
		rb[0] = new DanseRobot(); // 각각의 배열에 메모리 할당
		rb[1] = new DrawRobot();
		rb[2] = new SingRobot();
		              // DanseRobot , DrawRobot ,  SingRobot
		for(Robot r : rb) {
			action(r);
		}

	}

}
