package ch10;

public class MyException1 extends Exception {
	@Override
	public java.lang.String getMessage() {
		String errMsg = "최저보다 낮잖아요";
		return errMsg;

	}
	
}
