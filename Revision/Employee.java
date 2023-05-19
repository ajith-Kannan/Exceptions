package Revision;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Employee {

	private int id;
	private String name;
	private String role;
	private int salary;
	private String gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Employee(int id, String name, String role, int salary, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + ", gender=" + gender
				+ "]";
	}

	public List<Employee> findFemale(List<Employee> list1) {
		ArrayList<Employee> ee = new ArrayList<>();

		list1.forEach(x -> {
			if (x.getGender().equals("female")) {
				ee.add(x);

			}
		});

		return ee;

	}

	public List<String> findSalary(List<Employee> ss) {
		ArrayList<String> dd = new ArrayList<>();

		for (Employee xz : ss) {
			if (xz.getSalary() > 50000) {
				dd.add(xz.getName());

			}
		}
		return dd;

	}

	public List<Employee> findDeveloper(List<Employee> xx) {
		List<Employee> ff = xx.stream().filter(d -> d.getRole().equalsIgnoreCase("developer")).collect(Collectors.toList());
		return ff;
	}
	
	public List<Employee> findId(List<Employee>gg){
	
		Employee b = gg.get(0);
		ArrayList<Employee>jf = new ArrayList<>();
		for(Employee ff : gg) {
			if(ff.getId()>b.getId()) {
				b=ff;
			}
		}
		 b.setSalary(b.getSalary()+2000);
		 jf.add(b);
		 return jf;	
	}
	
	public List<String> addName (List<Employee> s ,List<String>h){
		List<String> kk = new ArrayList<>();
		for(int i=0; i<=s.size()-1; i++) {
			kk.add(s.get(i).getName().concat(h.get(i)));
		
		}
		return kk;
	}


	}

