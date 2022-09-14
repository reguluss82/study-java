package ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception2 {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int num1;
			//try 내의 실행 중 오류가 발생하면 try 내의 실행이 중단되고 catch 구문 안의 내용이 실행
			try {
				System.out.println("첫 번째 값을 입력하세요 => ");
				num1 = Integer.parseInt(in.readLine());
				System.out.println("두 번째 값을 입력하세요 => ");
				int num2 = Integer.parseInt(in.readLine());
				System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
			} catch (Exception e) { //중요한 페이지가 아니면 
				// TODO Auto-generated catch block
				System.out.println("값을 잘못 입력했습니다." + e.getMessage()); // getMessage() 많이씀
				System.out.println("0 나온 세상을 위해 노력하고 있습니다"); 
			}
			// e는 변수다. 이 변수 앞의 Exception은 변수의 데이터 타입이 Exception이라는 의미다. 
			// Exception은 자바에서 기본적으로 제공하는 클래스로 java.lang에 소속되어 있다. 
			// 예외가 발생하면 자바는 마치 메소드를 호출하듯이 catch를 호출하면서
			// 그 인자로 Exception 클래스의 인스턴스를 전달하는 것이다.
			// e.getMessage()는 자바가 전달한 인스턴스의 메소드 중 getMessage를 호출하는 코드인데,
			// getMessage는 오류의 원인을 사람이 이해하기 쉬운 형태로 리턴하도록 약속되어 있다.
		}
	}
}