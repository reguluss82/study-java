package ch11;

public class MyException1 extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//	return super.getMessage();
		String errMsg;
		errMsg = "사장님 최저보다 낮아요";
		return errMsg;
				
	}

}
