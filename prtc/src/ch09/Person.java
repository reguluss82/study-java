package ch09;

public class Person {
	String name;
	int    age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age  = age;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		Person p = null;
		boolean b = false;
		if(obj instanceof Person) p = (Person) obj;
		if(p != null && this.name == p.name && this.age == p.age) b = true;
		return b;
	}
}

