package ch03;

import java.io.IOException;

public class While2 {

	public static void main(String[] args) throws IOException {
		System.out.println("보고싶은 구구단은?");
		// System.in.read(); Scanner , BufferedReader 사용하지않고 입력값을 받을 수 있다.
		// 버퍼(inputStream) 사용해 효율적이며 IOException의 throw필수 //자동완성 System.in.read() 해야 import 된다.
		// 문자 하나씩만 가져올 수 있다
		// 시스템 키보드 값 읽어들임 아스키코드로 변환해 가져온다 
		int num = System.in.read() - '0'; // 입력 숫자가 ASKII의 십진수로 표현 되기때문에 -'0' 해주어야함 0의 십진법 표기 48
		int num2 = System.in.read();
		int i = 1;
		System.out.println("num->" + num);
		System.out.println("num2->" + num2);
		if (num >= 2 && num <= 20) { // && and 둘다 참인 부분만
			while (i <= 9) {
				System.out.println(num + " * " + i + " = " + num * i);
				i++;
			}
		} else {
			System.out.println("구구단에 없는 숫자입니다");
		}

	}

}
