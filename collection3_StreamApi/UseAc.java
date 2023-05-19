package collection3_StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UseAc {
	public static void main(String[] args) {
		
		Ac ac1 = new Ac("Coroma","TR-765",115000,1,"Single",2023);
		Ac ac2 = new Ac("LG","Cooler",23000,2,"Double",2023);
		Ac ac3 = new Ac("Loyed","Ultra Cooler",50000,3,"Single",2021);
		Ac ac4 = new Ac("Sony","XTR-98",50000,2,"Double",2023);
		Ac ac5 = new Ac("Tata","FF-67Y",679999,4,"Single",2023);
		
		ArrayList <Ac> acs = new ArrayList<>();
		acs.add(ac1);
		acs.add(ac2);
		acs.add(ac3);
		acs.add(ac4);
		acs.add(ac5);
		
		List<Integer> list1 = acs.stream().map(x->x.getPrice()).collect(Collectors.toList());
		list1.stream().distinct().forEach(a->System.out.println(a+"\n"));
		list1.stream().sorted().forEach(b->System.out.println(b));
		
		boolean list2 = acs.stream().map(y->y.getBrand()).anyMatch(a->a.equals("LG"));
		System.out.println(list2);
		
		
		
		
		
		List<String>rr=acs.stream().map(x->x.getBrand()).limit(2).collect(Collectors.toList());
		rr.forEach(z->System.out.println(z));
		
		boolean hh=acs.stream().anyMatch(x->x.getBrand().equals("onida"));
		System.out.println(hh);
		
		
		Optional<Ac> ll=acs.stream().filter(x->x.getPrice()>56000).max((x,y)->(Integer.compare(x.getPrice(),y.getPrice())));
		System.out.println(ll.get());
		
		Optional<Integer> ac6=acs.stream().map(x->x.getCapacity()).min((x,y)->(Integer.compare(x, y)));
		System.out.println(ac6);
		
	    int ac7=acs.stream().collect(Collectors.summingInt(s->s.getCapacity()));
	    System.out.println(ac7);
		
		
		
		
		
		
	
		
		
		
				
		
		
	}

}
