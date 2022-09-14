package ch10;

import java.util.Scanner;

//Exception 클래스의 하위 클래스
//- NoSuchMethodException : 메소드가 존재하지 않을 때
//- ClassNotFoundException : 클래스가 존재하지 않을 때
//
//RuntimeException 클래스의 하위 클래스
//- ArithmeticException : 0으로 나누는 등의 산술적인 예외
//- NegativeArraySizeException :배열의 크기를 지정할 때 음수의 사용
//- NullPointerException : null 객체의 메소드나 멤버 변수에 접근할 때
//- IndexOutOfBoundException : 배열이나 스트링의 범위를 벗어난 접근
public class MyExceptionEx {

	public static void main(String[] args) {
		int kkk = 0;
		// 1.객체선언
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 숫자 입력?");
		try {
			kkk = sc.nextInt();
			if (kkk > 10) throw new MyException();
		} catch (MyException e) { // 내가 정한 Exception
			System.out.println("MyException-->" + e.getMessage());
		} catch (Exception e) { // aaa입력하면 Exception-->null  <--시스템에서 
			  System.out.println("Exception-->" + e.getMessage());
		}
	}
}
