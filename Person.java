public class Person {
	public String firstName;
	public String lastName;
	public int age;
	public String gender;

	public void getInfo() {
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
	}
}