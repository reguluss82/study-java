package ch11;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째수");
		int num1 = sc.nextInt();
		System.out.println("두번째수");
		int num2 = sc.nextInt();
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(num1);
		hs.add(num2);
		
		while(true) {
			int num = (int) (Math.random() * 45)+1;
			System.out.println(num);
			hs.add(num);
			if(hs.size() == 6)
			break;
		}
		System.out.println(hs);
		sc.close();
		
		

	}

}
