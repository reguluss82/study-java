package ch09;

public class Person {
	int    id;    // Key
	String name;
	public Person ( int id, String name) {
		this.id   = id;
		this.name = name;
	}
	
	@Override  //개발자 주관으로 객체비교 방법 설정 목적
	//     return 형
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		Person  p = null;
		boolean b = false;
		
		if(obj instanceof Person)   p = (Person) obj; //메소드 equals로 전달된 obj의 데이터 타입이 Object이기 때문에 이를 Person 타입으로 형 변환
		if(obj != null && this.id==p.id && this.name==p.name) b = true; //여기서 id 는 this.id 나
		   //obj != null 이유 : 예상치못한 오류 대비해서 더블로 체크해주는
		return b; //boolean 유형 변수로 return해줘야 함
	}

}
