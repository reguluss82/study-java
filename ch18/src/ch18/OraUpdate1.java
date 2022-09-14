package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraUpdate1 {

	public static void main(String[] args) throws SQLException {
		Scanner    sc     = new Scanner(System.in);
		System.out.println("수정할 부서번호를 입력하세요");
		String     deptno = sc.nextLine();
		String     driver = "oracle.jdbc.driver.OracleDriver";
		String     url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String     sql1   = "Select dname, loc From dept Where deptno=" + deptno;
		Connection conn   = null;
		Statement  stmt   = null;
		ResultSet  rs     = null;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			rs   = stmt.executeQuery(sql1);
			
			if (rs.next()) {
				String dname  = rs.getString("dname");
				String loc    = rs.getString("loc");
				
				System.out.println("수정 전 부서명 : " + dname + "\n" + "새로 입력할 부서명을 입력하세요");
				String udname = sc.nextLine();
				System.out.println("수정 전 위치 : "   + loc   + "\n" + "새로 입력할 위치를 입력하세요");
				String uloc   = sc.nextLine();
				String sql2   = String.format("Update dept set dname = '%s', loc = '%s' Where deptno = %s", udname, uloc, deptno);
				int    result = stmt.executeUpdate(sql2);
				if (result > 0) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}
			} else {
				System.out.println("자료가 없습니다");
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (rs   != null)   rs.close();
			if (conn != null) conn.close();
			if (stmt != null) stmt.close();
		}
		sc.close();
	}
}
