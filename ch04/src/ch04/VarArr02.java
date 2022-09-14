package ch04;

public class VarArr02 {

	public static void main(String[] args) {
		int sum = 0;
		int[][] a = {{12,34,32},{21,54,76,23},{12,65}};
		for(int[] arr : a) {
			for(int ar : arr) {
				System.out.print(ar + "\t");
				sum += ar;
			}
			System.out.println("합계:"+sum+"\t 평균:"+sum/arr.length);
			sum = 0;
		}

	}

}
