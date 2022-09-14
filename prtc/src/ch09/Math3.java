package ch09;

public class Math3 {

	public static void main(String[] args) {
		int[] i = new int[6];
		int count = 0;
		while (count < 6) {
			int lotto = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i.length; j++) {
				if (lotto == i[j]) {
					lotto = 0;
					return;
				}
			}
			if (lotto > 0) {
				i[count] = lotto;
				count++;
			}
		}
		System.out.println("Lotto 당첨번호");
		for(int j = 0; j < i.length; j++) {
			System.out.println(j + "번째 : " + i[j]);
		}

	}

}
