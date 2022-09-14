package ch11;

import java.util.ArrayList;
//실무에서는 배열(Array)보다 ArrayList 를 더 많이쓰게 된다. 유연하기 때문
//컬렉션-List 인터페이스 배열과 List 비교
//배열과 컬렉션의 List구조는 같다고 볼 수 있으며 다르다면
//배열은 크기가 고정되어 있는 것이고 
//컬렉션의 List구조는 가변적 길이를 가진다는 것이다.
public class ArrayList2 {
	public static void print(ArrayList<String> listPrint) {
		for (String str : listPrint) {
			System.out.print(str + "\t");
		}
		System.out.println("\n------------------------------------------------------");
	}

	public static void main(String[] args) {
		String myString = "바나나";
		ArrayList<String> list = new ArrayList<>();
		list.add("바나나");
		list.add("수박");
		list.add("사과");
		list.add("바나나");
		list.add("수박");
		list.add("대추");
		list.add("바나나");
		System.out.println("갯수 : " + list.size());
		//   0       1       2       3       4       5       6
		// 바나나	수박	사과	바나나	수박	대추	바나나
		print(list);
		// 1번 자리에 끼워 넣기 가능하다
		list.add(1, "키위");
		print(list);
		list.set(4, "복숭아");
		print(list);
		list.remove(0);
		print(list);
		
		System.out.println("3번 인덱스 -->" + list.get(3));
		System.out.println("바나나 문의 : " + list.contains("바나나"));
		//System.out.println("바나나 문의 indexOf : " + list.indexOf("바나나",0));
		System.out.println("바나나 문의 indexOf : " + list.indexOf("수박"));
		System.out.println("바나나 문의 : " + list.lastIndexOf("수박"));
		System.out.println("\n------------------------------------------------------");
		
		// 수박  --> 메론 for
		int i = 0;
		for(String str : list) {
			if(str == "수박") list.set(i, "메론");
			i++;
		} 
		print(list);

//------일반형for-----------------------------------------
//		for(int j = 0; j < list.size(); j ++) {
//			if(list.get(j) == "수박") list.set(j, "메론");
//		}
//		print(list);
	}

}
