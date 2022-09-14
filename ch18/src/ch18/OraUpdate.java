package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraUpdate {

	public static void main(String[] args) throws SQLException {
		Scanner    sc     = new Scanner(System.in);
		System.out.println("수정할 부서를 입력하세요 ?"); String deptno = sc.nextLine();
		System.out.println("   부서명 ?");                String dname  = sc.nextLine();
		System.out.println("   근무지 ?");                String loc    = sc.nextLine();
		String     sql    =
				String.format("Update Dept set dname ='%s'," + "loc='%s' where deptno=%s" , dname, loc, deptno); //deptno -> %s 들어가는순간 숫자로.
		String     driver = "oracle.jdbc.driver.OracleDriver";
		String     url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn   = null;
		Statement  stmt   = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) System.out.println("수정성공 ^^");
			else            System.out.println("수정실패 T.T");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (stmt != null) stmt.close();
			if (conn != null) conn.close();
		}
		sc.close();
	}

}
