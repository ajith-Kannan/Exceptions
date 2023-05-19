package collection1_Array;
import java.util.ArrayList;
public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Raja",30,"HR",50000);
		Employee e2 = new Employee("Krish",29,"TeamLeader",40000);
		Employee e3 = new Employee("Diya",20,"Developer",60000);
		Employee e4 = new Employee("Rockey",25,"Developer",70000);
		
		ArrayList <Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		ArrayList <Employee> developerList = new ArrayList<>();
		for(Employee x : emp) {
			if(x.getRole().equals("Developer") && x.getSalary()>50000) {
				developerList.add(x);
			}
		}
		developerList.forEach(x->System.out.println(x));
		System.out.println();
		
		int temp = emp.get(0).getAge();
		Employee temp1 = emp.get(0);
		for(int i=0; i<=emp.size()-1 ;i++) {
			if(emp.get(i).getAge()>temp) {
				temp = emp.get(i).getAge();
				temp1 = emp.get(i);
			}
		}
		
		System.out.println(temp1);
		
		System.out.println();
		
		ArrayList <Employee> ageList = new ArrayList<>();
		for(Employee xx :emp) {
			if(xx.getAge()>23) {
				ageList.add(xx);
			}
		}
		ageList.forEach(ss-> System.out.println(ss));
		
		int val = emp.get(0).getName().length();
		
		for(int i=0; i<=emp.size()-1; i++) {
			if(emp.get(i).getName().length()>val) {
				val=emp.get(i).getName().length();
				
				
			}
		}
		System.out.println(val);
		
		
		
	}
	


	}


