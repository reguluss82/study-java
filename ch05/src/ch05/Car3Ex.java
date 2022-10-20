package ch05;

public class Car3Ex {

	public static void main(String[] args) {
		// 생성자 목적
		// 1) Memory
		// 2) Class member 변수 초기화
		Car3 c1 = new Car3("소나타",	10, 14);
		Car3 c2 = new Car3("그랜저",	9,	20);
		Car3 c3 = new Car3("아반떼",	12, 13);
		//Car3 c5 = new Car3(); 기본생성자 없으면 불가능
		// final
		// c1.AMTPERTIME = 2500; final 변수는 상수이므로 임의로 변경이 불가능
		
		c1.print();
		c2.print();
		c3.print();
		
	}

}
