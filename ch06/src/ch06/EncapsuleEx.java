package ch06;
//캡슐화(encapsulation)
//실제로 구현되는 부분을 외부에 드러나지 않도록 하여 정보를 은닉할 수 있다.
//데이터를 보이지 않고 외부와 상호작용을 할 때는 메소드를 이용하여 통신을 한다.
//객체가 독립적으로 역할을 할 수 있도록 데이터와 기능을 하나로 묶어 관리하는 것
//코드가 묶여있어서 오류가 없어 편리하다.
//보통 라이브러리로 만들어서 업그레이드해 사용할 수 있다.
class Encapsule {
	// 접근 제어자(access modifier)
	// 객체의 로직을 보호하기 위해서는 맴버에 따라서 외부의 접근을 허용하거나 차단해야 할 필요가 생긴다
	// 사용자에게 객체를 조작 할 수 있는 수단만을 제공 -> 객체의 사용에 집중 할 수 있도록 돕기 위함
	// private으로 설정되었다면 private 이 붙은 변수, 메소드는 해당 클래스에서만 접근이 가능하다.	
	// default 접근 제어자를 별도로 설정하지 않는다면 접근 제어자가 없는 변수, 메소드는 default 접근 제어자가 되어 해당 패키지 내에서만 접근이 가능
	// protected로 설정되었다면 protected가 붙은 변수, 메소드는 동일 패키지의 클래스 또는 해당 클래스를 상속받은 다른 패키지의 클래스에서만 접근이 가능하다.
	// public으로 설정되었다면 public 접근제어자가 붙은 변수, 메소드는 어떤 클래스에서라도 접근이 가능하다.
	private String	name;	
	private int		age = 2; // 초기화 기본값 0
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if (age < 0 ) System.out.println("나이입력오류 ㅎㅎㅎ");
		else this.age = age;
	}
}
	// return은 메소드의 결과 값을 돌려주는 명령어
	// 메소드는 들어온 입력값을 가지고 어떤 처리를 하여 적절한 리턴값을 돌려주는 박스와 같다.
	// public 리턴자료형 메소드명(입력자료형1 입력변수1, 입력자료형2 입력변수2, ...) {return 리턴값;}
	// 리턴자료형이 void인 경우 return 문 필요 없음
	// return문으로 메소드를 빠져나가는 방법은 리턴 자료형이 void형인 메소드에서만 사용할 수 있다. return;



public class EncapsuleEx { //한파일에 있어도 class 다르다. 구분

	public static void main(String[] args) {
		Encapsule h1 = new Encapsule();
		Encapsule h2 = new Encapsule();
		// h1.name = "홍길동"; private 이므로 접근 불가능
		h1.setName("홍길동");
		h1.setAge(20);
		System.out.println("이름 : " + h1.getName());
		System.out.println("나이 : " + h1.getAge());
		System.out.println("나이 : " + h2.getAge());
		
	}

}
