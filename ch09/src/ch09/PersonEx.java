package ch09;

public class PersonEx {

	public static void main(String[] args) {
		Person person1 = new Person(111, "김춘사");
		Person person2 = new Person(111, "김춘수");
		if (person1.equals(person2)) System.out.println("같다");
		else System.out.println("다르다");
		PersonG person11 = PersonG.getInstance();
		PersonG person12 = PersonG.getInstance();
		if (person11.equals(person12)) System.out.println("같다");
		else System.out.println("다르다");
	}

}
