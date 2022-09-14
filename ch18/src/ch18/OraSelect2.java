package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class OraSelect2 {

	public static void main(String[] args) throws SQLException {
		String     driver = "oracle.jdbc.driver.OracleDriver";
		String     url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String     sql    = "Select * From emp";
		Connection conn   = null;
		Statement  stmt   = null;
		ResultSet  rs     = null;
		System.out.println("사원명단");
		System.out.println("사원코드 사원명\t업무\t\t급여\t일자");
		System.out.println("=================================================");
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			rs   = stmt.executeQuery(sql);
//			7369	SMITH	CLERK	7902	80/12/17	800		20
//			7499	ALLEN	SALESMAN	7698	81/02/20	1600	300	30
//			7521	WARD	SALESMAN	7698	81/02/22	1250	500	30
//			7566	JONES	MANAGER	7839	81/04/02	2975		20
//			7654	MARTIN	SALESMAN	7698	81/09/28	1250	1400	30
//			7698	BLAKE	MANAGER	7839	81/05/01	2850		30
//			7782	CLARK	MANAGER	7839	81/06/09	2450		10
//			7788	SCOTT	ANALYST	7566	87/07/13	3000		20
//			7839	KING	PRESIDENT		81/11/17	5000		10
//			7844	TURNER	SALESMAN	7698	81/09/08	1500	0	30
//			7876	ADAMS	CLERK	7788	87/07/13	1100		20
//			7900	JAMES	CLERK	7698	81/12/03	950		30
//			7902	FORD	ANALYST	7566	81/12/03	3000		20
//			7934	MILLER	CLERK	7782	82/01/23	1300		10
//			1000	공현지	MANAGER	7902	22/08/03	2800		10
			if (rs.next()) {
				do {
					int    empno = rs.getInt(1);
					String ename = rs.getString(2);
					String job   = rs.getString(3);
					int    sal   = rs.getInt("sal");
					Date   date  = rs.getDate("hiredate"); // sql로보낼것이 아니라 일반적으로는 java.util.Date 사용
					if (job.length() > 7) 
						 System.out.printf("%d\t%s\t%s\t%d\t%TF\n" , empno,ename,job,sal,date);
					else System.out.printf("%d\t%s\t%s\t\t%d\t%TF\n"   , empno,ename,job,sal,date);
				} while (rs.next()); // Q
			} else {
				System.out.println("data No");
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (rs   != null) rs.close();
			if (conn != null) conn.close();
			if (stmt != null) stmt.close();
		}
	
	} 

}
