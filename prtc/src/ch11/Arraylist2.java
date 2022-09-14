package ch11;

import java.util.ArrayList;

public class Arraylist2 {
	public static void print(ArrayList<String> list) {
		for (String str : list) { 
			System.out.print(str + "\t");
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("바나나");
		list.add("수박");
		list.add("사과");
		list.add("바나나");
		list.add("수박");
		list.add("대추");
		list.add("바나나");
		System.out.println("크기" + list.size());
		print(list);
		System.out.println();
		list.add(1, "키위");
		list.set(4, "복숭아");
		list.remove(0);
		print(list);
		System.out.println();
		int i = 0;
		for (String str : list) {
			if(str == "수박") list.set(i, "메론");
			i ++;	
		}
		print(list);
		
	}

}
