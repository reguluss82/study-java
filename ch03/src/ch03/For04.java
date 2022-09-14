package ch03;

public class For04 {

	public static void main(String[] args) {
		for( int i = 0; i <= 10 ; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for( int i = 10; i >= 0; i--) {
			System.out.print(i+"\t");
		}
		System.out.println();
		// 0 시작 <=10	i 2씩 증가 i=i+2
		for( int i = 0; i <= 10; i+=2) {
			System.out.print(i+"\t");
		}
		System.out.println();//  i=i*2
		for( int i = 0; i <= 10; i*=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}

}
