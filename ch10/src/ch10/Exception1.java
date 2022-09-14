package ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception1 {
											// 너가 해라 예외처리
	public static void main(String[] args) throws NumberFormatException, IOException { 
		int kkk = 0;
		float fVar = (float) 22.31;
		String kStr = "문자열";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // stream 연속된

		while(true) {
			System.out.println();
			// print 출력 후 라인 바뀌지 않음
			System.out.print("첫 번째 값을 입력하세요 => ");
			int num1 = Integer.parseInt(in.readLine()); //in.readLine 엔터키 칠때까지 문자를 받아 문자열 생성
			System.out.print("두 번째 값을 입력하세요 => ");
			int num2 = Integer.parseInt(in.readLine());
			// println 출력 후 라인 바꿈
			System.out.println(num1 + " / " + num2 + " = " + num1/num2);
			// num1 100 num2 0 <- Exception in thread "main" java.lang.ArithmeticException: / by zero
			                     //at ch10.Exception1.main(Exception1.java:18)
			
			// printf 연습
			System.out.printf("1.printf -- > %d / %d = %d", num1, num2, num1/num2);
			System.out.println();
			System.out.printf("2.printf -- >문자 : %s 소수점 : %f", kStr, fVar);

		}
		
	}

}
