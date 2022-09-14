package ch10;

public class ExceptionEx03 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main메서드에서 예외가 처리");
		}
	}

	static void method1() throws Exception { //호출한 곳에서 처리해라
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1메서드에서 예외가 처리");
			throw e; // 다시 예외를 발생시킨다
		}
	} // method1메서드의 끝
}
