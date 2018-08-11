
public class PersonRunner {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setSuperpower("superpower1");
		person1.setName("Person1");
		Person person2 = new Person();
		person2.setSuperpower("superpower2");
		person2.setName("Person2");
		Person person3 = new Person();
		person3.setSuperpower("superpower3");
		person3.setName("Person3");
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());
	}
}
