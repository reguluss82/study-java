package exam;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		System.out.println("총 객체수: " + list.size());
		System.out.println();
		System.out.println("2: " + list.get(2));
		System.out.println();
		int i = 0;
		for(String lis : list) {
			System.out.println(i + ":" + list.get(i));
			i ++;
		}
		
		  // 2. HomeWork 
	      //  1) 총 객체수: 5
	      //  2) 2번째 항목 조회(Index)
	      //  3) 전체 리스트 조회
//		1.  총 객체수: 5
//
//		2: Database
//
//		0:Java
//		1:JDBC
//		2:Database
//		3:Servlet/JSP
//		4:iBATIS
	}

}
