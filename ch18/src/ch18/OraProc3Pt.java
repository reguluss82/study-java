package ch18;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraProc3Pt {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 사번 입력");
		String empno = sc.nextLine();
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "? = call func_sal(?)";
		Connection conn = null;
		CallableStatement cs = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			cs = conn.prepareCall(sql);
			cs.setString(2, empno);
			cs.registerOutParameter(1, java.sql.Types.DOUBLE);
			cs.executeQuery();
			Double sal = cs.getDouble(1);
			if(sal > 0) {
				System.out.println("수정성공");
				System.out.println("수정사번 : " + empno);
				System.out.println("수정급여 : " + sal);
			} else System.out.println("수정실패");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(conn != null) conn.close();
			if(cs != null) cs.close();
		}
		sc.close();
	}

}
