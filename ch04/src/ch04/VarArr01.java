package ch04;
//가변배열
public class VarArr01 {

	public static void main(String[] args) {
		int[][] a = new int [3][];
		a[0] = new int[3];  // 0,0 0,1 0,2  //행에 대해 열 지정
		a[1] = new int[2];  // 1,0 1,1
		a[2] = new int[4];  // 2,0 2,1 2,2 2,3
		// 행은 가변 불가, 열은 가변 가능
		// int[][] b = new int [][5]; <-- 오류난다.
		
		a[0][0] = 7;	a[0][1] = 23;	a[0][2] = 13;
		a[1][0] = 23;	a[1][1] = 3;
		a[2][0] = 2;	a[2][1] = 21;	a[2][2] = 56;	a[2][3] = 71;
		// 행
		for (int i = 0; i < a.length; i ++ ) {
			// 열
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
