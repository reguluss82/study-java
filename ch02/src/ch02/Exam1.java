package ch02;

public class Exam1 {

	public static void main(String[] args) {
		String[] names = { "Kim", "Lee", "Park", "Choi" };
		
		
		
		
	
		
		if (names[-1] == null) System.out.println("에러!! 인덱스는 음수가 될 수 없음.");
		
		
		
		System.out.printf("names[%d] => %s\n", -1, "에러!! 인덱스는 음수가 될 수 없음.");
		System.out.printf("names[%d] => %s\n", 4, "에러!! 배열 인덱스를 벗어남.");

			
	}
	
}
