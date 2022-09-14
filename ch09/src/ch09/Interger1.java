package ch09;

public class Interger1 {

	public static void main(String[] args) {
		String str	=  "3";
		// JDK Module화 -- JAVA API
		int int1 = Integer.parseInt(str); //***암기 숫자형의 문자를 넣어야함. String "3" 을 int로 변환
		//parseInt() 메서드는 결과값을 항상 int 형으로 리턴합니다.
		//이 때 반환되는 값은 객체가 아닌 기본 자료형(Primitive Type)입니다.
		int int2 = Integer.valueOf("5");
		//문자열의 값을 정수형으로 변환한 다음 Integer 객체로 만들어서 반환합니다.
		//즉 new Integer(Integer.parseInt(s)) 값이 리턴됩니다.
		//사실 Java 1.5에서 도입된 'Autoboxing and Unboxing' 덕에 서로 뭘써도 상관이 없습니다.
		//Integer 객체로 리턴을 받아서 int 변수에 할당하면 자동으로 형변환이 일어나기 때문입니다.
		//대신 내부적으로 객체 생성 오버헤드가 있을 수 있습니다.
		System.out.println("int1->"+int1);
		System.out.println("int2->"+int2);
		System.out.println(int1+int2);
		System.out.println("int1+int2-->"+int1+int2); // ""(문자열)가 있어서 int1 int2도 문자열로 인식
		System.out.println("int1+int2-->"+(int1+int2)); // 괄호로 묶어서 숫자로 계산후

	}

}
