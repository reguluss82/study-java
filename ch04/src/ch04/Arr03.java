package ch04;

public class Arr03 {

	public static void main(String[] args) {
		
		String[] str = {"코로나","물가","손흥민","개물림","우영우"};
		for(int i=0; i <str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("-------- 향상형 For문 --------");
		//				"코로나","물가","손흥민","개물림","우영우"
		for(String kk : str) {
			System.out.println("kk= "+kk);
		}

	}

}
