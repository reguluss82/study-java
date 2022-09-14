package ch04;

public class ArrTest9 {

	public static void main(String[] args) {
		String[] m = {"이름","국어","영어","수학","총점","평균"};
		String[] name = {"김준수","이하이","안예은","국카스텐"};
		int[][] score = {{80,70,90},{70,90,90},{80,70,80},{90,90,70}};
		int[] tot = new int[3];
		int sum = 0, avg = 0, totSum = 0, totAvg = 0; // 변수 이름 정할때 잘 이해할 수 있도록 가독성. 대문자 잘 섞어서
		System.out.println("성적표 \t");
		for(int i = 0; i<m.length;i++)
			System.out.print(m[i]+"\t");
		System.out.println("\n---------------------------------------------");
		
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i]+ "\t");
			for(int j = 0; j < score[i].length; j++ ) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
				tot[j] += score[i][j]; // i행 변화에따라 각 열j에 할당  
			}
				avg = sum/score[i].length;
				System.out.println(sum+"\t"+avg);
				sum = 0;
			}
		System.out.println("---------------------------------------------");
		System.out.print("총계"+"\t");
		
		for(int j = 0; j<tot.length; j++) {
			System.out.print(tot[j]+"\t");
			totSum += tot[j];
			}
		totAvg = totSum/(score.length*score[0].length);
		System.out.println(totSum +"\t"+totAvg);
		}
	}