package ch03;

public class Sw4 {

	public static void main(String[] args) {
		String str = args[0];
		int a1 = Integer.parseInt(args[1]);
		int b1 = Integer.parseInt(args[2]);
		switch(str) {
			case "+" : System.out.println("덧셈: "+ (a1 + b1 )); break; // 문자열과 숫자가 나란히 있으면 숫자도 문자열 취급.
			case "-" : System.out.println("뺄셈: "+ (a1 - b1 )); break; // ()로 묶어 숫자로 계산
			case "X" : System.out.println("곱셈: "+ (a1 * b1 )); break;
			case "/" : System.out.println("나눗셈: "+ (a1 / b1 )); break;
			case "%" : System.out.println("나머지: "+ (a1 % b1 )); break;
			default  : System.out.println("없는연산자" + (a1 + b1 ));
		}

	}

}
