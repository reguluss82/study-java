package ch10;

import java.util.Scanner;

public class MyExceptionEx2 {
	public static void main(String[] args) {
		int kkk = 0;
		Scanner sc = new Scanner(System.in);
		try {
			kkk = sc.nextInt();
			if(kkk < 180)               throw new MyException1();
			if(kkk > 180 && kkk < 1000) throw new MyException2();
		} catch (MyException1 e) {
			System.out.println(e.getMessage());
		} catch (MyException2 e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
