package ch04;

public class MultiArr01 {

	public static void main(String[] args) {
		int [][] a = new int[2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 11;
		a[1][1] = 12;
		a[1][2] = 13;       //행길이
		for (int i = 0; i < a.length; i++) { // 행 2
			for (int j = 0; j < a[i].length; j++) { // 열 3
				// System.out.println("일반 For a["+i+"]["+j+"]="+a[i][j]);
				System.out.print("일반 For " + a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("==============향상형For============");  
		//첫번째 for 2차원(a)에서 1차원(arr1) 받고 두번째 for 1차원(arr1)에서 원소(arr2) 받는다
		for(int[] arr1 : a ) {      // 행 --> a[0], a[1]			
			for(int arr2 : arr1) {   // 열 --> 0번행 a[0]-->[0][0],[0][1],[0][2]
				System.out.print("확장 For "+ arr2 + "\t");
			}
			System.out.println();
		}
	}

}
