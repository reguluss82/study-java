package robot;

public class MainClass{

	public static void main(String[] args) {
		System.out.println("-- SuperRobot 주문 --");
		Robot superRobot = new SuperRobot();
		superRobot.actionBasic();
		superRobot.shape();
		superRobot.actionFire();
		superRobot.actionFly();
		superRobot.actionKnife();
		System.out.println("----------------------");
		System.out.println("-- StandardRobot 주문 --");
		Robot standardRobot = new StandardRobot();
		standardRobot.actionBasic();
		standardRobot.shape();

	}

}
