package ch10;

public class MyExceptionEx03 {

	public static void main(String[] args) {
		try {
			method1();
			
		} catch (Exception e) {
			System.out.println("main 처리");
		}
	}

	
	static void method1() throws Exception {
		try {
			throw new Exception();
			
		} catch (Exception e) {
			System.out.println("method1 처리");
			throw e;
		}
	}
}
