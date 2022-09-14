package ch04;

public class SumAvg {

	public static void main(String[] args) {
		int []a = {85,90,75,100,95};
		int sum = 0;
		for (int score : a ) {
			sum += score;
		}
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + sum/a.length);

	}

}
