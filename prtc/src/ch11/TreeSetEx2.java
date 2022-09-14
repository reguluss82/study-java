package ch11;

import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(52);
		ts.add(24);
		ts.add(72);
		ts.add(34);
		ts.add(52);
		int i = 0;
		for (int t : ts) {
			System.out.println(i + "번째" + t);
			i++;
		}

	}

}
