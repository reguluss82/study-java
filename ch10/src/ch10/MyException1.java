package ch10;

public class MyException1 extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		// return super.getMessage();
		String errMsg = "";
		
		errMsg = "사장님 180만원 보다 적어요 !! 이 뭡니다";
		
		
		return errMsg;
	}

}
