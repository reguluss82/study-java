package ch03;

public class If2 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a > 0) {
			System.out.println(a + "는 양수");
		} else {
			System.out.println(a + "는 음수");
		}
	}

}
