package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyInsert {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("My Sql 부서코드 ?"); String dno      = sc.nextLine();
		System.out.println("My Sql 부서명 ?");   String dname    = sc.nextLine();
		System.out.println("My Sql 위치 ?");     String position = sc.nextLine();
		String     driver = "com.mysql.cj.jdbc.Driver";
		String     url    = "jdbc:mysql://127.0.0.1:3306/scottdb";
		String     sql    = String.format("Insert Into division(dno,dname,position)" 
		                         + "values(%s, '%s', '%s')", dno, dname, position );
								// sql로 들어갈때 String 으로 받아온 dno를 숫자로 해야하므로 ''이 없다.
		Connection conn   = null;
		Statement  stmt   = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql80");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) System.out.println("Mysql 입력성공 ^^");
			else            System.out.println("Mysql 입력실패 T.T");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (stmt != null) stmt.close();
			if (conn != null) conn.close();
		}
		sc.close();

	}

}
