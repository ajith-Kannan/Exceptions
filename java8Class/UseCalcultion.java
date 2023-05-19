package java8Class;

public class UseCalcultion {
	
	public static void main(String[] args) {
		
		Calculation add = (num1, num2)->num1+num2;
		System.out.println(add.find(100, 200));
		
		Calculation sub = (a,b)->a-b;
		System.out.println(sub.find(200, 100));
		
		Calculation mul = (x,y)->x*y;
		System.out.println(mul.find(100, 5));
		
		Calculation div = (f,h)->f/h;
		System.out.println(div.find(5, 100));
	}

}


