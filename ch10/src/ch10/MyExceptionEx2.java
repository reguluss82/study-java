package ch10;

public class MyExceptionEx2 {
    // paramether로 급여 받아 옴
	// 과제 -->180< 급여 <1000
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//                         급여
		try {
			int kkk = Integer.parseInt(args[0]);
			if (kkk < 180)  throw new MyException1();
			if (kkk > 1000) throw new MyException2();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java MyExceptionEx2 num1");
		 // 최저임금 오류
		} catch (MyException1 e) {
			System.out.println("MyException1-->" + e.getMessage());
		 // 최고임금 오류
		} catch (MyException2 e) { // 내가 정한 Exception
			System.out.println("MyException2-->" + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
