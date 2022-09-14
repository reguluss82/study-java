package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception7 {

	public static void main(String[] args) {
		FileReader reader;
		char[] buffer = new char[100];
		String file_name = ".classpath";  //. <- 현재폴더
		try { reader = new FileReader(file_name);
		     reader.read(buffer, 0, 100); // 0부터 100byte 읽을거야
		     String str = new String(buffer);     // 이 구문이 없어도 buffer로 바로 출력해도 되지만
		     System.out.println("읽은건 " + str); // String하위 메소드 필요한 상황이 있을수있으므로.
		     reader.close();
		} catch(FileNotFoundException e) {
			System.out.println("그런 파일 없슴당");
		} catch(IOException e) {
			System.out.println("읽다가 에러났슈");
		} finally {
		 System.out.println("어쨌거나 읽었어요");
		}
	}

}
