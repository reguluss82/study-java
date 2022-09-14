package ch12;

class Ra1 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + "대박" + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
	}
}

class Ra2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + "월요일" + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class RunnableTest1 {

	public static void main(String[] args) {
		Ra1 r1 = new Ra1();
		Ra2 r2 = new Ra2();
		// implement 한 것은 반드시 아래와 같은 선언후 사용 --> Thread th1 = new thread(r1) /면접질문있었음
		Thread th1 = new Thread(r1); //String s <- 생성자 명
		Thread th2 = new Thread(r2);
		th1.start();
		th2.start();

	}

}
