package ch11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pt = new Properties();
		String path = PropertiesEx.class.getResource("database.properties").getPath(); //add throws
		System.out.println("1 path : "     + path);  //결과값에 %20의 의미 ASKII코드로 space값 hex
		path = URLDecoder.decode(path, "utf-8"); // utf-8로 decode
		System.out.println("1-2 path : "     + path); 
		pt.load(new FileReader(path)); // add throws
		String driver = pt.getProperty("driver"); // properties 파일 보면  "="  기준으로 앞은 KEY 뒤는 Value
		System.out.println("2. 드라이버 : "  + driver);
		String url = pt.getProperty("url");
		System.out.println("3. url : "       + url);
		// 1. Homework --> username & password 출력
		String username = pt.getProperty("username");
		System.out.println("4. username : "  + username);
		String password = pt.getProperty("password");
		System.out.println("5. password : "  + password);
		

	}

}
