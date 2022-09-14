package ch09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			try {
			System.out.println("첫번째 값 입력 요청");
			int num1 = Integer.parseInt(in.readLine());
			System.out.println("두번째 값 입력 요청");
			int num2 = Integer.parseInt(in.readLine());
			System.out.println(num1 + " / " + num2 +" = " + num1/num2); 
			} catch (NumberFormatException e) {
				System.out.println("숫자입력하세요." + e.getMessage());
			} catch (ArithmeticException e) {
				System.out.println("두번째 숫자에 0입력하지마세요." + e.getMessage());
			} catch (Exception e) {
				System.out.println("값을 잘못 입력했습니다." + e.getMessage());
			}
			
		}
	}
}
