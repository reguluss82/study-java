package ch18;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraProc3 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 Oracle 사원코드 ?"); String empno = sc.nextLine();
		
		Connection        conn   = null;
		CallableStatement cs     = null;
		String            driver = "oracle.jdbc.driver.OracleDriver";
		String            url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String            sql    = "{? = call func_sal(?)}";
		try {
			Class.forName(driver); // 없어도 될수있음 , 연결 되어 있다면
			conn = DriverManager.getConnection(url, "scott", "tiger");
			cs   = conn.prepareCall(sql);
			cs.setString(2, empno);   // 변경사번
			cs.registerOutParameter(1, java.sql.Types.DOUBLE); // 변경급여
			cs.executeQuery();
			Double sal = cs.getDouble(1);
//			int로 받고 싶은 경우
//			cs.registerOutParameter(1, java.sql.Types.INTEGER); // 변경급여
//			cs.executeQuery();
//			int sal = cs.getInt(1);
			
			if (sal > 0) {
				System.out.println("Oracle CallableStatement 수정 성공 ");
				System.out.println("변경사번     :" + empno);
				System.out.println("변경급여    :"  + sal);
			}
			else System.out.println("Oracle CallableStatement 수정 실패 T.T ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(cs  != null)  cs.close();
			if(conn != null) conn.close();
		}
		sc.close();
	}

}
