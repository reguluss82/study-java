package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MyPreparePt {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 Mysql 부서코드 ?"); String dno      = sc.nextLine();
		System.out.println("입력할 Mysql 부서명 ?");   String dname    = sc.nextLine();
		System.out.println("입력할 Mysql 폰 ?");       String phone    = sc.nextLine();
		System.out.println("입력할 Mysql 근무지 ?");   String position = sc.nextLine();
		String            driver = "com.mysql.cj.jdbc.Driver";
		String            url    = "jdbc:mysql://127.0.0.1:3306/scottdb";
		String            sql = "Insert Into division(dno, dname, phone, position) Values(?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql80");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dno);
			pstmt.setString(2, dname);
			pstmt.setString(3, phone);
			pstmt.setString(4, position);
			int result = pstmt.executeUpdate();
			if(result > 0) System.out.println("입력성공");
			else           System.out.println("입력실패");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
		}
		sc.close();
	}

}
