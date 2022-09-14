package ch09;

import java.util.StringTokenizer;

public class StringTokenizer01 { //문자열 분리할때 유용하다.

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("산딸기, 집딸기,판딸기.집딸기,알카리딸기",".,");
		//StringTokenizer st = new StringTokenizer("산딸기, 집딸기,판딸기.집딸기,알카리딸기",",");
		//      산딸기, 집딸기,판딸기.집딸기,알카리딸기
		while (st.hasMoreElements()) {
			System.out.println( st.nextElement());
		}
	}

}
