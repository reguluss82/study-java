package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	// 1. JDBC(Java Database Connectivity) 
	// 자바 패키지의 일부로 자바 프로그램이 데이터베이스와 연결되어
	// 데이터를 주고받을 수 있게 해 주는 프로그래밍 인터페이스이다. 
	// 자바 데이터베이스 프로그래밍 API라고 할 수 있다. 
	// 2. JDBC 드라이버
	// My SQL 또는 오라클 드라이버를 자바가 설치되어 있는
	// C:\Program Files\OpenJdk11\jdk-11\bin
	// C:\Program Files\Java\jre1.8.0_73\lib\ext 란 폴더에 복사한다. 
	// OJDBC6.JAR, mysql-connector-java-5.1.15-bin.jar
	// mysql-connector-java-8.0.22.ja
	
	// 최신버전은 직접 ojdbc 추가해줘야함
	// java project 우클 -> Build Path -> Configure Build Path -> ClassPath -> Add External JARs -> ojdbc6.jar 선택 -> apply
public class OraDr {

	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		//                                 IP        Port Service ID
		String url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		// port 논리적인 서버 구분 //IP DB서버 주소 
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("start");
			if (conn != null) {
				System.out.println("Success 연결 성공");
			} else {
				System.out.println("Fail");
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
