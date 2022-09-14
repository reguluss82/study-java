package ch03;

public class If4_2 {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
		if (score > 97) grade = "A+";
		else if (score > 93) grade = "A";
		else if (score > 90) grade = "A-";
		else if (score > 87) grade = "B+";
		else if (score > 83) grade = "B";
		else if (score > 80) grade = "B-";
		else if (score > 77) grade = "C+";
		else if (score > 73) grade = "C";
		else if (score > 70) grade = "C-";
		else grade = "권총";
		System.out.println("당신의 점수는 "+score+"이고 "+"학점은 "+grade+"입니다");
	}

}
