package ch10;

public class MyException2 extends Exception {
  // 사장님 1000만원 넘 많아요
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		// return super.getMessage();
		String errMsg = "";
		errMsg = "사장님 1000만원 넘 많아요";
		return errMsg;
	}
}
