package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraDelete {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 부서를 입력하세요 ?");
		String deptno = sc.nextLine();
		Connection conn = null;
		Statement  stmt = null;
		String     driver   = "oracle.jdbc.driver.OracleDriver";
		String     url      = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String     sql      = "Delete dept Where deptno=" + deptno;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			// result는 작업에 성공한 갯수
			int result = stmt.executeUpdate(sql); // 입력/수정/삭제시 -> executeUpdate
			if(result > 0) {
				System.out.println("삭제성공");
			} else {
				System.out.println("삭제실패");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
			
		}
		sc.close();
	}

}
