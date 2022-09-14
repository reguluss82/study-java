package ch09;

class Point3D2 {
	int x, y, z;
	Point3D2 (int x, int y , int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public String toString() {
		return "[x=\" + x + \" ,y=\" + y + \" ,z= \" + z + \"]";
	}
	@Override
	public boolean equals(Object obj) {
		Point3D2 p = null;
		boolean  b = false;
		if(obj instanceof Point3D2) p = (Point3D2) obj;
		if(p != null && this.x == p.x && this.y == p.y)
			b = true;
		return b;
	}
}

public class HomeWork02 {

	

	public static void main(String[] args) {
		Point3D2 p1 = new Point3D2(1, 2, 6);
		Point3D2 p2 = new Point3D2(1, 3, 6);
		if(p1.equals(p2)) System.out.println("같");
						  System.out.println("다르");
		

	}

}
