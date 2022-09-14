package ch06;

import java.util.Scanner;

class Factorial {
	int result = 1;

	// 재귀함수 // 5! = 5*4*3*2*1 // 면접 알고리즘 시험등 가끔나옴
	void factorial(int cnt) {
		if (cnt > 1) {
			result *= cnt;	// result = result * cnt
			System.out.print(cnt + " * ");
			factorial(--cnt);
		} else {
			System.out.println(cnt);
			System.out.println("Factorial 결과는  " + result);
			return; // 무한루프 방지
		}
	}
}

public class FactorialEx {

	public static void main(String[] args) {
		Factorial fac = new Factorial();
		int InNum;
		System.out.println("Factorial 할 10이하의    숫자를 입력하세요 ?  ");
		Scanner sc = new Scanner(System.in);
		InNum = sc.nextInt();
		fac.factorial(InNum);

	}

}
