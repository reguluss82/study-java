package ch11;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> kk = new LinkedList<>();
		String[] animal = {"산토끼" , "고양이", "진도개", "치와와", "토끼"};
		for(int i = 0; i < animal.length; i ++) {
			kk.add(animal[i]);
		}
		int i = 0;
		Iterator<String> it = kk.iterator();
		while (it.hasNext()) {
			System.out.println(i + "->" + it.next());
			i ++;
		}
		System.out.println("kk.iterator.size->" + kk.size());

	}

}
