package ch10;
// 개발자가 Exception을 만들려면 Exception을 상속받아야 한다
// getMessage 오버라이드 <- 시스템 제공 에러메세지가 아닌 비즈니스 목적으로 새로만드는 에러메세지
public class MyException extends Exception {
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		// return super.getMessage();
		String errMsg;
		
		errMsg = "아니 10보다 크다니";
		
		return errMsg;
	}

}
