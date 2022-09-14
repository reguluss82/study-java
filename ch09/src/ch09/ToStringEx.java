package ch09;

class StrPrint {
	String name;
	int    prnInt = 7;
	StrPrint (String name) {
		this.name = name;
	}
	// 개발자가 override 재정의
	@Override //toString 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
		public String toString() {
		// TODO Auto-generated method stub
		// return super.toString();
		return "이름: " + name + " , 번호: " + prnInt; //보고싶은 멤버로 
	}
}

public class ToStringEx {

	public static void main(String[] args) {
		StrPrint sp1 = new StrPrint("경찰회의");
		StrPrint sp2 = new StrPrint("코로나");
		// hash code of the object 객체의ID같은
		System.out.println("sp1->"+sp1.toString());
		System.out.println("sp2->"+sp2);
		//toString을 재정의(overiding)했다.
		//그리고 인스턴스를 System.out.println의 인자로 전달하니까
		//toString을 명시적으로 호출하지 않았음에도 동일한 효과가 나고 있다.
		//toString 메소드는 자바에서 특별히 취급하는 메소드다.
		//toString을 직접 호출하지 않아도 
		//어떤 객체를 System.out.print로 호출하면 
		//자동으로 toString이 호출되도록 약속되어 있다. sp2
	}

}
