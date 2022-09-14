package ch10;

public class Throw1 {

	public static void main(String[] args) {
		System.out.println("안녕");
		Exception e1 = new Exception("내가 Error 만들었다");
		try {							//e2.getMessage()
			throw e1;
		//  System.out.println("이건 안 출력");
		}   catch (Exception e2) {
			   System.out.println("e2 Exception -->" + e2.getMessage() + " kkk");
		}
		System.out.println("프로그램이 저장 종료되었음.");

	}

}
