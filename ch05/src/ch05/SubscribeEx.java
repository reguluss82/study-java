package ch05;

class Subscribe {
	  String  name;
	  String  telnum;
	  int     age;
	  // 생성자 overLoading
	  Subscribe () {
	  }
	  
	  Subscribe (String n,  String t) {
		   name   = n;
		   telnum = t;
	  }
	  
	  void ChgTelNum(String t) {
		  telnum = t;
	  }
	  void ChgAge(int age1) {
		  if (age1 < 0) {
			  System.out.println("당신은 - 나이를 넣고 있네요");
			  return;
		  }
		  age = age1;
	  }
	  void print() {
		  System.out.printf("이름: %s 전화번호: %s\n",name,telnum);
	  }
}

public class SubscribeEx {

	public static void main(String[] args) {
		Subscribe s1 = new Subscribe("이성계","010-2223-5567");
		s1.print();
		Subscribe s2 = new Subscribe();
		s2.name = "김유신";
		s2.age =-10;
		// 직접 멤버 변수에 접근하면 문제발생시 유지보수에 있어 문제 발생 하나하나 수정해줘야하는 수고가 발생
		s2.ChgTelNum("010-2267-6789");
		// 이런식으로 메소드를 사용하면 문제를 미연에 방지를 할 수 있다. 권장사항
		s2.print();
		
		
	}

}
