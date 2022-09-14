package ch11;
//컬렉션 프레임웍의 핵심인터페이스
//다 외워라 중요하다 면접, 배열과 List의 비교도 물어본다.
import java.util.ArrayList;
//실무 많이쓴다 ArrayList HashMap, Properties 많이 쓴다.
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(); //<제네릭> < -- 넣는대로 다 받는다
		al.add("고양이");
		al.add("길양이");
		al.add("강아지");
		al.add("진도개");
		al.add("고양이");
		for(int i=0; i < al.size() ; i++) {
			System.out.println(al.get(i));
		}
		System.out.println("=================향상형=================");
		for(String str : al) {
			System.out.println(str);
		}

	}

}
