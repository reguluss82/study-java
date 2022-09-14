package ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			try {
				System.out.println("첫 번째 값을 입력하세요 => ");
				int num1 = Integer.parseInt(in.readLine());
				System.out.println("두 번째 값을 입력하세요 => ");
				int num2 = Integer.parseInt(in.readLine());
				System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해야 합니다");
			} catch (ArithmeticException e) { // 중요한 페이지가 아니면 Exception
				System.out.println("0으로 나누면 안돼요");
			} catch (Exception e) { // 중요한 페이지가 아니면
				System.out.println("전체 오류");
				// TODO Auto-generated catch block
				// System.out.println("값을 잘못 입력했습니다." + e.getMessage()); // getMessage() 많이씀
				// 중요한 페이지같은 경우 위와같이 여러 Exception 세분화
			}
		}
	}
}
