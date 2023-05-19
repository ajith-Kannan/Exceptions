package collection3_StreamApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Raja",500000,"HR",30,"male");
		Employee e2 = new Employee("Krish",200000,"TeamLeader",29,"male");
		Employee e3 = new Employee("Diya",60000,"Developer",27,"female");
		Employee e4 = new Employee("Rockey",70000,"Developer",28,"male");
		Employee e5 = new Employee("Teju",40000,"Developer",23,"female");
		
		ArrayList <Employee> emp = new ArrayList();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		
		emp.stream().filter(x->x.getSalary()>50000).forEach(y->System.out.println(y));
		
		List <Employee> list1 = emp.stream().filter(xx->xx.getRole().equals("Developer")).collect(Collectors.toList());
		list1.forEach(yy->System.out.println(yy));
		
		emp.stream().map(x->x.getName().charAt(x.getName().length()-1)).forEach(y->System.out.println(y));
		emp.stream().map(y->y.getGender()).forEach(z->System.out.println(z));
		
		List<Integer> list2 = emp.stream().map(x->x.getAge()).collect(Collectors.toList());
		list2.forEach(xx->System.out.println(xx));
		
		long l = list2.stream().count();
		System.out.println(l);
		
		Map<String,Employee> list3 = emp.stream().filter(a->a.getAge()>23).collect(Collectors.toMap(b->b.getName(), c->c));
		list3.forEach((a,b)-> System.out.println(a+" "+b));
		
		Set<Integer> set1 = emp.stream().map(y->y.getSalary()).collect(Collectors.toSet());
		set1.forEach(x->System.out.println(x));
	}

}
