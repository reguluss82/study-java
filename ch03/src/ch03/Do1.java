package ch03;

public class Do1 {

	public static void main(String[] args) {
		int sum = 0, i = 1;
		do {
			sum += i;
			i++;
		} while( i <=10);
		System.out.println("햡계:" + sum);
	}

}
