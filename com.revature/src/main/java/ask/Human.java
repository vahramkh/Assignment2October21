package ask;

public class Human {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String speak() {
		return "Hello";
	}
	public String getName() {
		return name;
	}
}
