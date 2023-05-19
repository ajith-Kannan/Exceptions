package day4;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		String mobile1= args[0];
		String []m01 =mobile1.split("#");
		
		m1.brand=m01[0];
		m1.price=Integer.parseInt(m01[1]);
		m1.ram=Integer.parseInt(m01[2]);
		m1.taxPercent=Integer.parseInt(m01[3]);
		
		m1.netPrice=m1.price+(m1.price*m1.taxPercent/100);
		System.out.println(m1.netPrice);
		
		Mobile m2 = new Mobile();
		String mobile2=args[1];
		String []m02 = mobile2.split(",");
		
		m2.brand=m02[0];
		m2.price=Integer.parseInt(m02[1]);
		m2.ram=Integer.parseInt(m02[2]);
		m2.taxPercent=Integer.parseInt(m02[3]);
		
		m2.netPrice=m2.price+(m2.price*m2.taxPercent/100);
		System.out.println(m2.netPrice);
		
		Mobile m3 = new Mobile();
		String mobile3= args[2];
		String []m03=mobile3.split("@");
		
		m3.brand=m03[0];
		m3.price=Integer.parseInt(m03[1]);
		m3.ram=Integer.parseInt(m03[2]);
		m3.taxPercent=Integer.parseInt(m03[3]);
		
		m3.netPrice=m3.price+(m3.price*m3.taxPercent/100);
		System.out.println(m3.netPrice);
		
		int total=m1.netPrice+m2.netPrice+m3.netPrice;
		System.out.println(total);
				
		
		m3.rating=Float.parseFloat(m03[4]);
		System.out.println(m3.rating);
		
		
		
	}

}
