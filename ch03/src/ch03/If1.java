package ch03;

public class If1 {

	public static void main(String[] args) {
		int a = -12;
		if (a > 0)
			System.out.println(a + "는 양수"); // sout 문자열과 변수가 붙으면 문자열로

		else {
			System.out.println(a + "는 음수"); // {}는 한줄이면 없어도 됨 두줄이상일때 부터 {} 반드시 감싸주어야한다
		}
		System.out.println("프로그램 종료");
	}

}
