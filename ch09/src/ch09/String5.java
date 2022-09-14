package ch09;

public class String5 {

	public static void main(String[] args) {
		//                 012345
		String fullName = "Hello.java"; //String 객체로 두면 String의 유용한 함수들을 사용할수 있다는 장점
		int index = fullName.indexOf('.');  // .의 index값을 구한다
		System.out.println("index->" + index);
		
		String filename = fullName.substring(0, index); // 0 부터 index-1까지(0~index 미만)
		String ext = fullName.substring(index+1); // index+1 부터 끝까지 
		System.out.println(fullName + "의 확장자를 제외한 이름은 " + filename);
		System.out.println(fullName + "의 확장자는 " + ext);

	}

}
