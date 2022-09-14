package ch12;

// 1. 생성자이름을 가진 ThreadExample4 만들기
// 2. 20번 돌아가면서 System.out.print(getName()+"대박" +i);
// 3. 10/1000초 쉬기

class ThreadExample4 extends Thread {
	ThreadExample4(String str) {
		super(str);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.print(getName() + "...대박" + i);
			if (i % 5 == 0) System.out.println();
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}

		}

	}
}

//1. 생성자이름을 가진 ThreadExample5 만들기
//2. 20번 돌아가면서 System.out.print(getName()+"월요일" +i);
//3. 50/1000초 쉬기

class ThreadExample5 extends Thread {
	ThreadExample5(String str) {
		super(str);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.print(getName() + "...월요일" + i);
			if (i % 5 == 0) System.out.println();
			try {
				sleep(50);
			} catch(InterruptedException e){ 
				e.printStackTrace();
			}

		}

	}
}

public class ThreadTestHw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ThreadExample4, ThreadExample5
		// Instance명 --->te4, te5
		// 멀티 쓰레드로 실행 시키기
		ThreadExample4 te4 = new ThreadExample4("ThreadExample4");
		ThreadExample5 te5 = new ThreadExample5("ThreadExample5");

		te4.start();
		te5.start();
	}

}
