package ch09;

public class Math1 {

	public static void main(String[] args) {
		int[] i = new int[6];
		for(int j=0 ; j < 6; j++) {
			int lotto = (int) ( Math.random() * 45) + 1; //Math.random()은 double 이므로 (int) 로 casting
			i[j] = lotto;
		}
		System.out.println("--- Lotto 당첨번호 ----");
		for(int j=0 ; j < i.length; j++) {
			System.out.println(j+"번째:" +i[j]);
		}

	}

}
