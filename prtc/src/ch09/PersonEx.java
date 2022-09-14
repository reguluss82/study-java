package ch09;

public class PersonEx {

	public static void main(String[] args) {
		Person person1 = new Person("고길동", 44);
		Person person2 = new Person("고길동", 45);
		
		if(person1.equals(person2)) System.out.println("같다");
		else System.out.println("다르다");

	}

}
