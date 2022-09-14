package ch07;
// 업캐스팅(Upcasting)이란 서브 클래스의 객체가 수퍼 클래스 타입으로 형변환되는 것
// 즉, 수퍼 클래스 레퍼런스 변수가 서브 클래스로 객체화된 인스턴스를 가리킬 수 있게 된다. 
// 더 쉽게 풀어서 예시를 들어보면 사람은 생물이다라고 생각하면 된다.
// 여기서 사람은 서브 클래스이고 생물은 수퍼 클래스다.
public class Car2Ex {

	public static void main(String[] args) {
		Car2[] cars = new Car2[3];
		// 부모객체에 자식 객체 대입 가능 
		cars[0] = new Bus();
		cars[1] = new Ambulance();
		cars[2] = new FireEngine();
		// 자식 타입은 부모 타입으로 자동 타입 변환
		
		// Bus bb = new Car2(); 자식객체에 부모 객체 대입 불가능
		
		for(Car2 car : cars) { //객체 배열 쓰면 향상형 for 문 가능
			// 실행은 부모와 같은 이름의 자식 메소드가 실행 (자식 메소드  수행)
			car.move();
			// 멤버변수는 부모것만 적용
			System.out.println("for Car2-->" +car.a);
			// Ambulance.special() 존재 --> 실행 불가
			//	car.special(); --> car는 부모타입으로 형변환된 자식클래스 instance
			if (car instanceof Ambulance) { //Ambulance 배열에 있어서 
			// instanceof (객체타입확인)
			//- 참조변수가 참조하는 인스턴스의 실제 타입을 체크하는데 사용. 
			//- 이항연산자이며 피연산자는 참조형 변수와 타입. 연산결과는 true, false. 
			//- instanceof의 연산결과가 true이면, 해당 타입으로 형변환이 가능
				
				// 자식 메소드 직접사용과 자식 멤버변수 출력하는 방법
				// 강제 형변환 -> 부모타입으로 형변환 했던 자식클래스를 다시 자식 클래스 타입으로 변환
				Ambulance amb = (Ambulance) car; // add to cast Ambulance 
				amb.special(); //자식 메소드
				System.out.println("for Car2-->" +amb.a);// 자식 멤버변수 출력
				System.out.println("두번째 방법-->" + ((Ambulance)car).a);
			}
		}

	}

}
