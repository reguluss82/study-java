package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
//HW3 MyDelete
//부서번호 받아 Row 삭제하기
//일반  stmt 객체 생성 
//MySql 삭제할 부서를 입력하세요 ?
//50
//MySql 삭제 성공  ^ ^ 
public class MyDelete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mysql 삭제할 부서를 입력하세요");
		String dno = sc.nextLine();
		Connection conn   = null;
		Statement  stmt   = null;
		String     driver = "com.mysql.cj.jdbc.Driver";
		String     url    = "jdbc:mysql://127.0.0.1:3306/scottdb";
		String     sql    = "Delete From division Where dno="+dno;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql80");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result > 0) System.out.println("삭제 성공");
			else           System.out.println("삭제 실패");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
