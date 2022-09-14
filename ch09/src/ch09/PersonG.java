package ch09;

public class PersonG {
	
		//전역 객체변수로 사용하기 위해 static 객체변수로 생성
		static PersonG instance;
		
		//생성자를 priavte로 만들어 접근을 막는다
		private int    id;    // Key
		private String name;
		private PersonG ( int id, String name) {
			this.id   = id;
			this.name = name;
		}
		
		//getInstance 메소드를 통해 한번만 생성된 객체를 가져온다.
		public static PersonG getInstance(){
			if(instance == null){ //최초 한번만 new 연산자를 통하여 메모리에 할당한다.
				instance = new PersonG(2222, "아무개");
			}		
			return instance;
		}
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			//return super.equals(obj);
			PersonG  p = null;
			boolean b = false;
			
			if(obj instanceof PersonG)   p = (PersonG) obj; //메소드 equals로 전달된 obj의 데이터 타입이 Object이기 때문에 이를 Person 타입으로 형 변환
			if(obj != null && this.id==p.id && this.name==p.name) b = true; //여기서 id 는 this.id 나
			
			return b;
	}
}
