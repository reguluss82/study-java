package ch18;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraProc1 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 Oracle 부서코드 ?"); String deptno = sc.nextLine();
		System.out.println("입력할 Oracle 부서명 ?");   String dname  = sc.nextLine();
		System.out.println("입력할 Oracle 근무지 ?");   String loc    = sc.nextLine();
		
		Connection        conn   = null;
		// PROCEDURE 호출객체
		CallableStatement cs     = null; //prepareStatement를 상속받았다. 따라서 비슷함
		String            driver = "oracle.jdbc.driver.OracleDriver";
		String            url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String            sql    = "{call dept_Insert(?, ?, ?)}";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			cs   = conn.prepareCall(sql);
			cs.setString(1, deptno);
			cs.setString(2, dname);
			cs.setString(3, loc);
			int result = cs.executeUpdate();
			if (result > 0) System.out.println("Oracle CallableStatement 입력 성공 ^ ^ ");
			else            System.out.println("Oracle CallableStatement 입력 실패 T.T ");
//			Boolean resultBool = cs.execute();
//			if (resultBool) System.out.println("Oracle CallableStatement 입력 성공 ^ ^ ");
//			else            System.out.println("Oracle CallableStatement 입력 실패 T.T ");
// 실행은 되지만 false로 받아서 실패. 받는 값이 없는 procedure이므로 다른 방법을 사용해야함
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(cs   != null) cs.close();
			if(conn != null) conn.close();
		}
		sc.close();
	}

}
