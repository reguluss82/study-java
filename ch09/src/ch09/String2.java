package ch09;

public class String2 {

	//String클래스는 char배열에 기능(메서드)을 추가한 것이다.
	//char배열과 String클래스의 한 가지 중요한 차이가 있는데
	//String객체(문자열)는 읽을수만 있을 뿐 내용을 변경할 수 없다는 것이다. 
	//String값이 바뀌는 것 같지만 새로운 문자열이 생겨 str이 새로운 주소값을 가르키는 것이다.(String str = "string")
	
	public static void main(String[] args) {
		char[] c = { 'k', 'o', 'r', 'e', 'a' }; // 문자 하나하나 배열
		System.out.println("c->" + c);
		System.out.println(c);
		String str1 = new String(c);
		System.out.println("str1->" + str1);
		String str2 = new String(" Fighting"); //생성자 overLoading char[]넣어도 "Figgting" 넣어도 가능한 이유다
		System.out.println("str2->" + str2);
		String str3 = str1 + str2; // 원래있던건 남아있고 새로만들어지는
		System.out.println("str3->" + str3);

		System.out.println(2 + 1 + 1 + 5 + "년"); // 숫자가 먼저 연산
		System.out.println("연1:" + 2 + 1 + 1 + 5); // 문자열 먼저나와서 모두 문자열로
		System.out.println("연2:" + (2 + 1 + 1 + 5)); // 숫자에 괄호를 쳐서 우선순위를 숫자연산으로

	}

}
