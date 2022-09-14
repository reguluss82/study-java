package ch07;

public class OuterEx {

	public static void main(String[] args) {
		//Outer out1 = new Outer(100, 100);
		//Outer.Inner in1 = out1.getInner();
		Outer.Inner in1 = new Outer(100, 100).new Inner(); //getInner 필요없이 한번에
		System.out.println("부피 : " + in1.volume());
		
		
		Outer out2	= new Outer(200, 100);
		Outer.Inner in2 = out2.getInner();
		System.out.println("부피 : " + in2.volume());
		
	}

}
