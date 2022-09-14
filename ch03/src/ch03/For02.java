package ch03;

import java.io.IOException;

public class For02 {

	public static void main(String[] args) throws IOException {
		System.out.println("보고싶은 구구단 숫자는");
		int num = System.in.read() - '0';
		// 선택한 구구단이 나올수 있도록 For문 구현
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

}
