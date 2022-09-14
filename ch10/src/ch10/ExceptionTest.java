package ch10;

public class ExceptionTest {
	static void callDriver() throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver"); // Oracle driver
		System.out.println("완료"); //윗라인에서 오류가 발생했으므르 실행조차 안됨
	}

	public static void main(String[] args) {
		try {
			callDriver();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {                                     //finally는 오류 유무 상관없이 실행
			System.out.println("시스템 종료.");         //finally 블록은 필수 블록은 아니다.
														//finally 블록이 사용되면 finally 블록의 내용은 예외 발생 유무나 예외 catch 유무와 상관
														//없이 무조건 수행. 따라서, 데이터베이스나 파일을 사용한 후 닫는 기능과 같이 항상
														//수행해야 할 필요가 있는 경우에 사용한다
		}
	} 

}
