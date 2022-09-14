package ch16;

import java.io.File;

public class Dir01 {
		
	public static void main(String[] args) {
		//File file = new File(".");  // . 내 파일 불러오기 .. 부모 파일 불러오기
		//File file = new File(Stirng fileName);
		//주어진 문자열을 이름으로 갖는 파일을 위한 File instance 생성
		//파일 뿐만 아니라 디렉토리도 같은 방법으로 다룬다 fileName은 주로 경로포함지정
		File file = new File("../ch13/src/ch13");// 원하는 폴더로 가서 파일 리스트 보기
		String[] fileList = file.list(); // 파일 안에있는 리스트를 스트링 배열로 받아주기 때문에 스트링으로 선언 해줘야함
								// 현재 ch16 파일 안에 잇는 리스트 가져온다.String[]	.list() 디렉토리의 파일목록을 String배열로 반환
		for(String str : fileList) {
			System.out.println(str);
		}
	}

}
