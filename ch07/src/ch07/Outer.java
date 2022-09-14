package ch07;
// InnerClass
// 1) 클래스 안에 선언된 클래스
// - 특정 클래스 내에서만 주로 사용되는 클래스를 내부 클래스로 선언
// - GUI어플리케이션(AWT, Swing)의 이벤트처리에 주로 사용된다. 
// 2) 내부 클래스의 장점
// - 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다. 
// - 코드의 복잡성을 줄일 수 있다(캡슐화)
// ----------------------------------------------------------------
// 	1) 중첩(내부) 클래스 (Inner Class) 
// 	- 클래스 내부에 또 다른 클래스를 가짐으로 클래스 관리의
//	효율을 높인 것(static 포함불가) 
// 	2) 중첩 클래스의 형식과 생성파일
// 	- 형식) class Outer { class Inner { … } } 
// 	- 생성파일) Outer.class, Outer$Inner.class
// 	3) 중첩 클래스 객체 생성
// 	- Outer.Inner oi = new Outer().new Inner();
public class Outer {
	int	   width  = 10;
	int	   height = 10;
	
	Outer(int width, int height) {
		this.width	= width;
		this.height	= height;
		
	}
	// method앞에 붙는것은 Return형
	public Inner getInner() {
		return new Inner();
	}
	class Inner {
		int depth = 10;
		public int volume() {
			return width * height * depth;
		}
	}
}
