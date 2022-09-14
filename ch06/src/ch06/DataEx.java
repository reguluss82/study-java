package ch06;
// *** 면접 단골손님
// 기본형 (primitive)
//	- Call by value(값에 의한 호출) 값에 의한 호출은 메서도 인자로 값을 넘길 때 값을 '복사' 해서 넘기게 되는데요. 이 때문에 원본의 값은 변하지 않습니다.
//	- int, long, float, double
//	- parameter 값 넘겨줄 때 --> value
// 이름만 같을 뿐 다른 주소를 가지는 별개의 친구들

// 참조형(Reference) 객체
//	- Call by reference(참조에 의한 호출)
//	- String, Integer, Class Instance 
//	- parameter 값 넘겨줄 때 --> 주소값
// 동일한 주소값을 가지고 객체의 상태를 수정하므로
class Data {
	int kor;
	int eng;
	int math;
	
	// call by reference Data d1 의 주소값을 넘겨주겠다
	void addRef(Data d1 , Data d2) { //객체를 넘겨주면 주소값이 넘어감 ->주소에 있는 내용이 변함 전역변수처럼 된다
		d1.kor = d2.eng; // addRef 지역메소드
		System.out.println("call by reference addRef Method 국어 점수 "+d1.kor);
	}
	// call by value
	//	 Call by Value 방식을 수행할 때, 값을 넘겨받은 메소드에서
	//	 값을 복사하여 새로운 지역 변수에 저장합니다.
	void addValue(int kor , int eng) { //기본자료형을 쓰면 실제값이 넘어감
		kor = eng;
		System.out.println("call by value addValue Method 국어 점수 "+kor);
		
	}

}

public class DataEx {

	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data();
		
		d1.kor		= 50;
		d1.math		= 70;
		d2.eng		= 80;
		
		d3.addRef(d1, d2);		// Instance를 넘겨주면 주소값을 넘겨주는 효과
		System.out.println("Main 국어 점수 : "+ d1.kor);
		d3.addValue(80, 70);	// Value를 넘겨줌
		System.out.println("Main 국어 점수 : "+ d3.kor); // 0나옴
	}

}
