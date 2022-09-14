package ch12;

import java.util.ArrayList;

class Before extends Thread {
	Before(String str) {
		super(str);
	}
	void addCar() {
		System.out.println("addCar");
		JoinTest.carList.add("벤츠");
		JoinTest.carList.add("아우디");
		JoinTest.carList.add("SM7");
		JoinTest.carList.add("포르쉐");
	}
	@Override
	public void run() {
		System.out.println("Before Thread 이름 :" + getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		addCar();
		}
	}


class After extends Thread {
	After(String str) {
		super(str);
	}
	@Override
	public void run() {
		System.out.println("After Thread 이름 :" + getName());
		for(String car : JoinTest.carList) {
			System.out.println(car);
		}
	}
}


public class JoinTest {
	public static ArrayList<String> carList = new ArrayList<String>();
	
	public static void main(String[] args) {
		Before bf = new Before("우선");
		After  af = new After("나중에");
		bf.start();
		try {
			bf.join(); //bf가 나머지 thread들 끝날때까지 대기 / 들어가있는 값을 출력해야 하니까
		} catch (InterruptedException e) {
		}
		af.start();

	}

}
