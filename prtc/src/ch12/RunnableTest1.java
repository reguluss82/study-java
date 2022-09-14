package ch12;

class Ra1 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + "대박" + Thread.currentThread().getName());
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Ra2 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + "월요일" + Thread.currentThread().getName());
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class RunnableTest1 {

	public static void main(String[] args) {
		Ra1 ra1 = new Ra1();
		Ra2 ra2 = new Ra2();
		Thread th1 = new Thread(ra1, "th1");
		Thread th2 = new Thread(ra2, "th2");
		th1.start();
		th2.start();
	}

}
