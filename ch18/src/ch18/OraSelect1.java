package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraSelect1 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서코드를 입력하세요");
		int        deptno   = sc.nextInt();
		String     driver   = "oracle.jdbc.driver.OracleDriver";
		//                                       IP        Port Service ID
		String     url      = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String     sql      = "Select dname,loc From Dept Where deptno=" + deptno;
		Connection conn     = null;  // DB    오류가 날수도있으니 null로두고 try안에서 
		Statement  stmt     = null;  // Sql
		ResultSet  rs       = null;  // SQL 실행 결과를 반환 받기 위한 ResultSet 객체
		try {
			Class.forName(driver); // JDBC 드라이버 로드
			conn = DriverManager.getConnection(url, "scott", "tiger"); // 데이터베이스 연결
			stmt = conn.createStatement();  // stmt Statement생성 statement 는 SQL 처리 기본 객체
			rs   = stmt.executeQuery(sql);  // SQL executeQuery(sql) SQL문 전송 및 결과받기 객체 rs
			 // rs  Row
			if (rs.next()) { // if 쓴 이유는 pk로 조건절을 걸어놔서 유일한 row 받을 것을 확실히 알고있기 때문 <-pk특징 유일성
				String dname = rs.getString("dname");  // rs.getString(1); <-- dname
				String loc   = rs.getString(2);        // rs.getString(2); <-- loc //sql에 명시해준 순서 dname 1 loc 2, 
				System.out.println("부서명:"   + dname);                           //만약 범위가 *였다면 table에 명시된 순서대로
				System.out.println("부서번호:" + deptno);
				System.out.println("위치:"     + loc);
			}
			else {
				System.out.println("자료가 없습니다");
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} finally { //close(); 연결해제 사용한 자원을 반납함
			if(rs   != null)   rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}
		sc.close();
	}

}
