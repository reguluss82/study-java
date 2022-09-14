package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		list.add("귤");
		list.add("오렌지");
		list.add("바나나");
		System.out.println("size" + list.size());
		Iterator<String> elements = list.iterator();
		while(elements.hasNext()) {
			System.out.println(elements.next());
		}
		
	
	}

}
