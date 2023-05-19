package collection2_Hashmap;
import java.util.HashMap;
import java.util.Iterator;
public class UseCustomer {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("JACK",678965437856l,23,"male",25000);
		Customer c2 = new Customer("RIYA",543278703451l,25,"female",30000);
		Customer c3 = new Customer("Mukesh",786514983564l,29,"male",15999);
		Customer c4 = new Customer("DIYA",78335495345l,22,"female",40000);
		Customer c5 = new Customer("Suresh",445632198732l,41,"male",10000);
		
		HashMap <Long,Customer> customers = new HashMap<>();
		customers.put(c1.getAdhaarNum(), c1);
		customers.put(c2.getAdhaarNum(), c2);
		customers.put(c3.getAdhaarNum(), c3);
		customers.put(c4.getAdhaarNum(), c4);
		customers.put(c5.getAdhaarNum(), c5);
		
		Iterator <Customer> itr = customers.values().iterator();
		while(itr.hasNext()) {
			if(itr.next().getGender().equals("male")) {
				itr.remove();
			}
		}
		customers.forEach((a,b)-> System.out.println(a+" "+b));
		

		for(Customer x : customers.values()) {
			if(x.getAge()>23) {
				x.setPurchaseAmount(x.getPurchaseAmount()+(x.getPurchaseAmount()*5/100));
				
			}
		}
		customers.forEach((x,y)-> System.out.println(x+" "+y));
		
		Iterator <Customer> itr1 = customers.values().iterator();
		while(itr1.hasNext()) {
			if(itr1.next().getAdhaarNum()==678965437856l ) {
				itr1.remove();
			}
		}
		customers.forEach((a,b)-> System.out.println(a+" "+b));

		
		
	}

}
