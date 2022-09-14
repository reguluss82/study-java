package ch09;
// Pattern 클래스
//	정규 표현식에 대상 문자열을 검증하는 기능은 
//	ava.util.rege.Pattern 클래스의 matches()메소드를 활용하여 검증할 수 있다. 
//	matches() 메서드의 첫번째 매개값은 정규표현식이고 두번째 매개값은 검증 대상 문자열이다. 
//	검증 후 대상문자열이 정규표현식과 일치하면 true, 그렇지 않다면 false값을 리턴한다. 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx {

	public static void main(String[] args) {
		 String[] data = {"bat", "baby", "bonus", "cA","ca",
	                      "cO", "c.", "c0", "car","combat","count", 
	                      "date", "disc"};
		 //        c     --> 맨 앞의 한 글자는 c로
		 //        [a-z] --> c다음 글자는 영어 소문자 
		 //        *     --> 아무글자나
		// Pattern p = Pattern.compile("c[a-z]*"); // 다양한 사용방법은 구글링하면서 테스트
		// Pattern p = Pattern.compile("b[a-z]*"); // compile(String regex) : 주어진 정규표현식으로부터 패턴을 만듭니다.
	     Pattern p = Pattern.compile("c[A-Z]*");   // 패턴을 구별할 때 , 원하는 조건의 값을 받고싶을때
		 for(int i=0; i < data.length; i++) {
			 Matcher m = p.matcher(data[i]); // Matcher 클래스는 대상 문자열의 패턴을 해석하고 주어진 패턴과 일치하는지 판별할 때 주로 사용,  
			 								 // Pattern객체의 matcher() 메소드를 호출하여 받아올 수 있습니다.
			 								 // matcher(CharSequence input) : 대상 문자열이 패턴과 일치할 경우 true를 반환합니다.
			 if(m.matches()) { 				 // matches() : 대상 문자열과 패턴이 일치할 경우 true 반환합니다. (Matcher 클래스의 메소드)
				 System.out.print(data[i] + ",");
			 }
		 }

	}

}
