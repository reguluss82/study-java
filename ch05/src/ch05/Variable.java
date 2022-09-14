package ch05;
//변수 범위
class Var {
	// Class 변수 는 static 붙여준다 instance 없이 사용 가능
	static	int k;
	// Instance 변수
	String	color ="멋있어";	// Member 변수 , 필드  속성을 표현하는 것
	int		speed = 33;
	
	void scope() {
		// 지역변수 : method 안의 변수
		int s = 77;
		System.out.println(s+"scope method");
	}
}


public class Variable {

	public static void main(String[] args) {
		Var.k = 10;
		Var	var1 = new Var();
		var1.speed = 55;
		System.out.println("speed->"+var1.speed);
		var1.scope();
		// System.out.println("scope.s->"var1.s); s는 지역변수 이므로 scope() 를 써야 가능

	}

}
