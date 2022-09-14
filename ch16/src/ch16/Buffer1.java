package ch16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer1 {

	public static void main(String[] args) throws IOException {	//System.in 콘솔로부터 데이터를 입력받는데 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //InputStreamReader OS에서 사용하는 기본인코딩의 문자로 변환하는
		System.out.println("이름은 ?");
		String name = br.readLine(); // 한 라인을 읽어온다 (BufferedReader의 메소드)
		System.out.println("주소은 ?");
		String addr = br.readLine();
		System.out.println(name + "님은 "+ addr + "에 사시는군요");
	}

}
