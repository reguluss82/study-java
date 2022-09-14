package ch04;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] scores = {76,45,34,89,100,50,90,92};
		int sum = 0, max = 0, min = 100;
		//초기화 중요 초기값 설정을 해 두어야 예기치않은 문제 방지. 예상 못하는 값이 들어가있는 경우가 있다.
		System.out.println("--------향상for-------");
		for (int score : scores)  {
			sum += score;
			if (score > max) max = score;
			if (score < min) min = score;
			}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+sum/scores.length);
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		//
		System.out.println("--------일반for-------");
		sum = 0;
		max = 0;
		min = 100;
		for (int i = 0; i < scores.length; i++ ) {
			sum += scores[i];
			if (scores[i] > max) max = scores[i];
			if (scores[i] < min) min = scores[i];
			}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+sum/scores.length);
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		}

}
