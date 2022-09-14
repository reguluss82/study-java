package ch09;

public class String3 {

	public static void main(String[] args) {
		//  index 0 1 2 
		String str = "15분 남았음";
		for(int i = 0; i < str.length(); i ++ ) {
			System.out.print(str.charAt(i)+ " ");
		}
		System.out.println();
		for(int i = str.length() -1; i >= 0 ; i --) {
			System.out.print(str.charAt(i));
		}
	}

}
