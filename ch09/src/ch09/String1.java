package ch09;

// equals 메소드는 비교하고자 하는 대상의 내용 자체를 비교하지만
// == 연산자는 비교하고자 하는 대상의 주소값을 비교
// 객체 비교는 해시코드비교라 
// 헷갈리는 것들은 면접에서 물어볼만하다
public class String1 {

	public static void main(String[] args) {
		String a1 = "Java"; // String 객체에 문자열 리터럴을 저장
		String a2 = "Java"; // a1 과 같은 메모리 주소값 참조
		String a3 = new String ("Java"); // 문자열 상수를 생성자에 전달해서 String 객체를 생성
		String a4 = new String ("java");
		System.out.println(a1 + "," + a2 + " , " + a3);
		// == 연산자는 비교하고자 하는 대상의 주소값
		if (a1 == a2 ) System.out.println("== a1과 a2는 같다");
		else           System.out.println("== a1과 a2는 다르다");
		if (a1 == a3 ) System.out.println("== a1과 a3는 같다");
		else           System.out.println("== a1과 a3는 다르다");
		
		// equals 메소드는 비교하고자 하는 대상의 내용 자체를 비교
		// 하지만 String 객체의 equals() 함수는 다음과 같다.
		// 문자열의 char 를 하나하나 비교하여 동일하면 true, 다르면 false 를 반환한다.
		// String 의 경우 같은 문자라도 주소가 다를 수 있지만,
		// equals() 함수를 오버라이드하여 재구성했기 때문에 동일한 문자열의 확인이 가능하다.
		if (a1.equals(a2)) System.out.println("equals a1과 a2는 같다");
		else               System.out.println("equals a1과 a2는 다르다");
		if (a1.equals(a3)) System.out.println("equals a1과 a3는 같다");
		else               System.out.println("equals a1과 a3는 다르다");
		
		if (a1.equals(a4)) System.out.println("equals a1과 a4는 같다");
		else               System.out.println("equals a1과 a4는 다르다");
		// 대소문자(Case) 무시
		if (a1.equalsIgnoreCase(a4)) System.out.println("a1과 a4는 같다");
		else                         System.out.println("a1과 a4는 다르다");
	}

}
