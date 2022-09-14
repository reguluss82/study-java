package ch11;

public class MyException2 extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		// return super.getMessage();
		String errMsg;
		errMsg = "1000은 너무 많은거 아닙니까";
		return errMsg;
	}
}
