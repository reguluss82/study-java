package ch10;

import java.util.Scanner;

public class MyExceptionEx21 {
    // paramether로 급여 받아 옴
	// 과제 -->180< 급여 <1000
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//                         급여
		int kkk = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("급여를 입력하세요");
		try {
			kkk = sc.nextInt();
			if (kkk < 180) throw new MyException1();
			if (kkk > 180 && kkk <1000) throw new MyException2();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java MyExceptionEx2 num1");
		 // 최저임금 오류
		} catch (MyException1 e) {
			System.out.println("MyException1-->" + e.getMessage());
		} catch (MyException2 e) { // 내가 정한 Exception
			System.out.println("MyException2-->" + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
