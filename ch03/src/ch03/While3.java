package ch03;

public class While3 {

	public static void main(String[] args) {
			int i = 1, j =2;
			System.out.println("구구단");
			while ( i <= 9 ) {
				while ( j<= 9 ) {
				System.out.println(j+" * "+i+" = "  +j*i + "\t" );
				j ++;
			}
			System.out.println();
			j = 2; //j 2부터 초기화
			i ++;
			
		}

	}

}
