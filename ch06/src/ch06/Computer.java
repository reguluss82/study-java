package ch06;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) { // ... <- 주는대로 다 받아준다 . 파라미터 넣는대로 / 가변변수일때 유용하다
		int sum = 0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
