package Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UseEmployee {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(2455,"Raja","HR",577778,"male");
		Employee e2 = new Employee(2455,"Krish","TeamLeader",560000,"male");
		Employee e3 = new Employee(4557,"Diya","Developer",654000,"female");
		Employee e4 = new Employee(5473,"Rockey","Developer",50000,"male");
		Employee e5 = new Employee(5478,"Teju","Developer",567000,"female");
		
		ArrayList<Employee>emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);

		e1.findFemale(emp).forEach(x->System.out.println(x));
		e1.findSalary(emp).forEach(y->System.out.println(y));
		
		e1.findDeveloper(emp).forEach(z->System.out.println(z));
		e1.findId(emp).forEach(g->System.out.println(g));
		
		ArrayList<String> hh = new ArrayList<>();
		hh.addAll(Arrays.asList("Raja","Krish","Diya","Rocky","Teju"));
		
		e1.addName(emp, hh).forEach(x->System.out.println(x));

	}

}
