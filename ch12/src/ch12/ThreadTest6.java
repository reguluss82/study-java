package ch12;

import javax.swing.JOptionPane;

class ThreadExample6 extends Thread {
	@Override
	public void run() {
		for ( int i = 0; i < 10 ; i ++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}


public class ThreadTest6 {

	public static void main(String[] args) {
		ThreadExample6 te6 = new ThreadExample6();
		te6.start(); //메모리에 올라감 main이랑 따로다. -> Multi Thread로 돌아간다.
		
		String name = JOptionPane.showInputDialog("너 이름이 뭐니?");
		System.out.println("당신의 이름은 " + name + " 입니다");

	}

}
