package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("손흥민", "010-3333-3333");
		hm.put("김준수", "010-2222-3456");
		hm.put("조정은", "010-3456-7890");
		Set<String> st = hm.keySet();
		for(String str : st) {
			System.out.println(hm.get(str));
		}
		Iterator<String> it = st.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(hm.get(key));
		}
	}
}
