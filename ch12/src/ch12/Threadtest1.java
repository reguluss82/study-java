package ch12;

class ThreadExample1 extends Thread {
	ThreadExample1(String str) {
		super(str);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		for (int i = 1; i <= 100; i ++) {
			System.out.print(getName() + i + "\t");
			if ( i%10 == 0) System.out.println();
			try {
				Thread.sleep(50); // 50/1000초 단위로
			} catch (InterruptedException e) {
				// TODO: handle exception
				//e.eprintStackTrace
			}
		}
		super.run();
	}
}



public class Threadtest1 {

	public static void main(String[] args) {
		ThreadExample1 a1 = new ThreadExample1("subThreadA");
		ThreadExample1 a2 = new ThreadExample1("subThreadB");
		
//		a1.start(); //메모리에 올려놓는다. run() 호출/ multi Thread방식 시분할처리
//		a2.start();
		
		a1.run(); // 내가 직접 돌린거다 <- 싱글Thread로 된다. 일반적인 Method 실행방식
		a2.run();
		for (int i = 1; i <= 100; i ++) {
			System.out.print("Main " + i + "\t");
			if ( i%10 == 0) System.out.println();
		}

	}

}
