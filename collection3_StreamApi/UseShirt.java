package collection3_StreamApi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class UseShirt {
	public static void main(String[] args) {
		
		Shirt s1 = new Shirt("Polo","Small",700,"Black","Cotton");
		Shirt s2 = new Shirt("Denim","Medium",1500,"Blue","Jeans");
		Shirt s3 = new Shirt("Basics","Small",2000,"White","Poly");
		Shirt s4 = new Shirt("Tommy","Large",1600,"Red","Cotton");
		Shirt s5 = new Shirt("Jungle","Small",700,"Brown","Poly");
		
		ArrayList<Shirt> shirts = new ArrayList<>();
		shirts.add(s1);
		shirts.add(s2);
		shirts.add(s3);
		shirts.add(s4);
		shirts.add(s5);
		
		List<Shirt>list1=shirts.stream().filter(a->a.getMaterial().equals("Cotton") && a.getColor().equals("Black")).collect(Collectors.toList());
		list1.forEach(y->System.out.println(list1));
		
		List<String>list2 =shirts.stream().map(b->b.getSize()).collect(Collectors.toList());
		list2.forEach(y->System.out.println(y+"\n"));
		
		List<String>list3 = shirts.stream().filter(c->c.getBrand().startsWith("T")).map(c->c.getColor()).collect(Collectors.toList());
		list3.forEach(z->System.out.println(z));
		
		List<String>list4 = shirts.stream().map(d->d.getMaterial()).filter(e->e.equals("Cotton")).collect(Collectors.toList());
		list4.forEach(zz->System.out.println(zz));
		
		long x  = shirts.stream().map(a->a.getColor()).filter(b->b.equals("Red")).count();
		System.out.println(x);
		
		
		
		
		
		
		
	}

}
