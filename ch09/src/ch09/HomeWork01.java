package ch09;
//1. 두개의 Method OverRide
//2. 객체 조회시 --> [x=1 ,y= 2 ,z= 3]
//                   [x=1 ,y= 2 ,z= 5]
//3. 객체 비교시     x,y 값만 비교 적용 
class Point3D {
	int x,y,z;
	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public String toString() {
		
		return "[x=" + x + " ,y=" + y + " ,z= " + z + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Point3D p = null;
		boolean b = false;
		
		if(obj instanceof Point3D)  p = (Point3D) obj;
		if(obj != null && this.x == p.x && this.y == p.y) b = true;
		return b;
	}
}

public class HomeWork01 {

	public static void main(String[] args) {
		Point3D pd1 = new Point3D(1, 2, 3);
		Point3D pd2 = new Point3D(1, 2, 4);
		Point3D pd3 = new Point3D(1, 2, 5);
		
		if (pd1.equals(pd2)) System.out.println("같다");
		else                 System.out.println("다르다");
		if (pd1.equals(pd3)) System.out.println("같다");
		else                 System.out.println("다르다");
		System.out.println(pd1.toString());
		System.out.println(pd3);
	
	}

}
