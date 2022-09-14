package ch06;

class Car2 {
	String	name;
	String	color;
	int		speed;
	//  this 인스턴스 자신을 가리키는 참조변수. 인스턴스의 주소가 저장되어있음
	//  인스턴스변수와 지역변수를 구별하기 위해 참조변수 this사용 권장!
	
	Car2(String name, String color, int speed) { //생성자 : 클래스 명과 같다/ 메소드지만 void가 없다/ 메모리를 생성시켜준다/ 멤버변수의 초기값 세팅
		this.name	= name;
		this.color	= color;
		this.speed	= speed;
	}
	void print() {
		System.out.println(name + "\t" + color + "\t" + speed );
	}
}


public class Car2Ex {

	public static void main(String[] args) {
		Car2 c1 = new Car2("소나타","빨강",150);
		c1.print();
	}

}
