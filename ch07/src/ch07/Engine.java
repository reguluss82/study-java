package ch07;

public class Engine {
	String	type;	// 타입
	int		cc;		// 배기량
	
	Engine(String type , int cc) {
		this.type	=	type;
		this.cc		=	cc;
	}
	
	void print() {
		System.out.println("타입  : " + type);
		System.out.println("배기량 : " + cc);
	}

}
