package ch06;

//	1) 오버로딩(overloading) 
//	- 메소드 다중정의
//		1) 같은 클래스 내에서 만 오버로딩을 할 수 있다. 
//		2) 같은 이름을 가진 메소드를 여러개 정의 하는 방법. 
//		3) 규칙: * 메쏘드의 이름이 같아야한다. 
//		[1] 메소드 인자의 숫자가 다르거나
//		[2] 메소드 인자의 타입이 달라야한다. 
//		[3] 메소드 리턴타입,접근지정자는 상관없다.
//	2) 오버라이딩(overriding) 
//	- 메소드 재정의 - 조상클래스로부터 상속받은 메서드의 내용을 상속받는 클래스에 맞게 변경하는 것
//		1. 선언부가 같아야 한다.(이름, 매개변수, 리턴타입) 
//		2. 접근제어자를 좁은 범위로 변경할 수 없다. 
//		- 조상의 메서드가 protected라면, 범위가 같거나 넓은 protected나 public으로만 변경할 수 있다. 
//		3. 조상클래스의 메서드보다 많은 수의 예외를 선언할 수 없다
//	------------------------------------------------


class MethodOV {
	// Method OverLoading  --> 같은 class 내 이름은 같고  
	//                         매개변수 갯수가 다르거나 Data형이 다른 경우 
	void print() {
		System.out.println("매개변수 없음");
	}
	void print(int a1) {
		System.out.println("매개변수 int  1개:" + a1);
	}
	void print(String x1) {
		System.out.println("매개변수 str  1개" + x1);
		
	}
	void print(int a1, String x1) {
		System.out.printf("매개변수 int  1개[%d] Str  1개[%s]:",a1,x1);
	}	
}




public class MethodOVEx {

	public static void main(String[] args) {
		MethodOV mov1 = new MethodOV();
		mov1.print();
		mov1.print(7);
		mov1.print("짜장면");
		mov1.print(3, "짜장면");

	}

}
