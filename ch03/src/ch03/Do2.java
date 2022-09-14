package ch03;

public class Do2 {

	public static void main(String[] args) {
		System.out.println("구구단 Do2");
		int i = 1, j = 2;
		do {
			do {
				System.out.print(j + " * " + i + " = " + i * j + "\t"); // \t 탭키 간격
				j++;
			} while (j <= 9);
			System.out.println(); // 줄바꿈
			i++;
			j = 2;
		} while (i <= 9);

	}

}
