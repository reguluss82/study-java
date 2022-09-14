package ch18;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//HW1(MyPrepare)
//1.division TBL 입력 (폰 포함)
//2.PreparStatement 쓰기  
//입력할 Mysql 부서코드 ?
//51
//입력할 Mysql 부서명 ?
//구매1팀
//입력할 Mysql 폰 ?
//01023456789
//입력할 Mysql 근무지 ?
//강남
//Mysql Prepare 입력성공 ^^
import java.util.Scanner;

public class MyPrepare {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 Mysql 부서코드 ?"); String dno      = sc.nextLine();
		System.out.println("입력할 Mysql 부서명 ?");   String dname    = sc.nextLine();
		System.out.println("입력할 Mysql 폰 ?");       String phone    = sc.nextLine();
		System.out.println("입력할 Mysql 근무지 ?");   String position = sc.nextLine();
		String            driver = "com.mysql.cj.jdbc.Driver";
		String            url    = "jdbc:mysql://127.0.0.1:3306/scottdb";
		String            sql    = "Insert Into division values(?, ?, ?, ?)";
				                      
		Connection        conn   = null;
		PreparedStatement pstmt  = null;
		
		try {
			Class.forName(driver);
			conn  = DriverManager.getConnection(url, "root", "mysql80");
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
			if(conn  != null) conn.close();
			if(pstmt != null) pstmt.close();
			
		}
		sc.close();
	}

}
