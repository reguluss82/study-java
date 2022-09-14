package robot;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("-- SuperRobot 주문  --");
		Robot superRobot = new SuperRobot(); // 아버지한테 자식 대입 가능 생성자가 SuperRobot 생성자 가보면 메모리 구조를 만들어준다
		superRobot.actionBasic();
		superRobot.shape();
		superRobot.actionFly();
		superRobot.actionFire();
		superRobot.actionKnife();
		System.out.println("----------------------");
		System.out.println("--StandardRobot주문--");
		Robot standardRobot = new StandardRobot();
		standardRobot.actionBasic();
		standardRobot.shape();
		standardRobot.actionFly();
		standardRobot.actionFire();
		standardRobot.actionKnife();
		System.out.println("----------------------");
		System.out.println("-- CheapRobot 주문 --");
		Robot cheapRobot = new CheapRobot();
		cheapRobot.actionBasic();
		cheapRobot.shape();
		cheapRobot.actionFly();
		cheapRobot.actionFire();
		cheapRobot.actionKnife();
		
	}

}
