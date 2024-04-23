
public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String nameParameter) {
		name = nameParameter;
	}
	
	public void setAge(int ageParameter) {
		age = ageParameter;
	}
	
	public void printName() {
		System.out.println(name);
	}
	public void printAge() {
		System.out.println(age);
	}
	public void printAll() {
		System.out.println(name + "\n");
		System.out.println(age);
	}
}
