package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//HW2 MySelect1
//부서번호 받아 조회하기
//일반  stmt 객체 생성
//Mysql 부서코드를 입력하세요
//50
//mysql 부서코드 :50
//mysql 부서명   :구매팀
//mysql 전화번호 :null
//mysql 근무지   :역삼
public class MySelect1 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mysql 부서코드를 입력하세요");
		int        dno    = sc.nextInt();
		String     driver = "com.mysql.cj.jdbc.Driver";
		String     url    = "jdbc:mysql://127.0.0.1:3306/scottdb";
		Connection conn   = null;
		Statement  stmt   = null;
		ResultSet  rs     = null;
		String     sql    = "Select * From division Where dno=" + dno;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql80");
			stmt = conn.createStatement();
			rs   = stmt.executeQuery(sql);
			if(rs.next()) {
				String dname    = rs.getString("dname");
				String phone    = rs.getString("phone");
				String position = rs.getString("position");
				System.out.println("부서코드 : "   + dno);
				System.out.println("부서명   : "   + dname);
				System.out.println("전화번호 : "   + phone);
				System.out.println("근무지   : "   + position);
			} else {
				System.out.println("자료가 없습니다");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (stmt != null) stmt.close();
			if (conn != null) conn.close();
		}
		sc.close();
	}

}
