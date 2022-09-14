package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraInsert {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서 번호 입력?"); String deptno = sc.nextLine();
		System.out.println("부서명 입력?");    String dname  = sc.nextLine();
		System.out.println("위치 입력?");      String loc    = sc.nextLine();
		
		Connection conn = null;
		Statement  stmt = null;
		String     driver   = "oracle.jdbc.driver.OracleDriver";
		 // Localhost - >127.0.0.1; , port 번호:1521 , xe(orcl)_> Service ID(Sid)
		String     url      = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		// Dept Table Insert를 완성
//		String     sql      = "Insert Into dept Values(" + deptno + ",'" + dname + "','" + loc + "')"; //SQL문의 ;은 완성하지 않아도됨
		String     sql      = String.format("Insert Into dept Values(%s, '%s', '%s')", deptno, dname, loc);
		
		System.out.println("sql->" + sql); // 간단한 확인방법
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql); // update된 갯수
			if (result > 0) System.out.println("입력성공 ^^");
			else            System.out.println("입력실패 T.T");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (stmt != null) stmt.close();
			if (conn != null) conn.close();
		}
		sc.close();
	}

}
