package collection3_StreamApi;

public class Employee {
	private String name;
	private int salary;
	private String role;
	private int age;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee(String name, int salary, String role, int age, String gender) {
		super();
		this.name = name;
		this.salary = salary;
		this.role = role;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", role=" + role + ", age=" + age + ", gender="
				+ gender + "]";
	}
	
	

}
