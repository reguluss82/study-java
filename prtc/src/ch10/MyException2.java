package ch10;

public class MyException2 extends Exception {
	@Override
	public String getMessage() {
		String errMsg = "1000만원은 너무 많지";
		return errMsg;
	}

}
