package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class OraPrepare {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 Oracle 부서코드 ?"); String deptno = sc.nextLine();
		System.out.println("입력할 Oracle 부서명 ?");   String dname  = sc.nextLine();
		System.out.println("입력할 Oracle 근무지 ?");   String loc    = sc.nextLine();
		
		Connection        conn   = null;
		PreparedStatement pstmt  = null; // **PreparedStatement 특징목적 /내용분리. secure coding. Transaction Isolation, 가독성
		String            driver = "oracle.jdbc.driver.OracleDriver";
		String            url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String            sql    = "Insert Into dept values(?, ?, ?)";
		
		try {
			Class.forName(driver);
			conn  = DriverManager.getConnection(url, "scott", "tiger");
			pstmt = conn.prepareStatement(sql); // sql 추가 Statement 와 비교
			pstmt.setString(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			int result = pstmt.executeUpdate(); //statement는 이때 sql 추가
			if (result > 0) System.out.println("OraPrepare 입력성공 ^^");
			else            System.out.println("OraPrepare 입력실패 T.T");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace(); error추적 하나하나씩 프린트
		} finally {
			if (pstmt != null) pstmt.close();
			if (conn  != null) conn.close();
		}
		sc.close();
	}

}
