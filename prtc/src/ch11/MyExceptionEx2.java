package ch11;

public class MyExceptionEx2 {

	public static void main(String[] args) {
		try {
			int kkk = Integer.parseInt(args[0]);
			if(kkk < 180) throw new MyException1();
			if(kkk > 180 && kkk < 1000) throw new MyException2();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("사용방법봐" + e.getMessage());
			// TODO: handle exception
		} catch (MyException1 e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		} catch (MyException2 e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

	}
}
