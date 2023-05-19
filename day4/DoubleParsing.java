package day4;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DoubleParsing {
	public static void main(String[] args) {
		
		String a = args[0];
		String b = args[1];
		
		double num1 = Double.parseDouble(a);
		double num2 = Double.parseDouble(b);
		
		double add = num1+num2;
		System.out.println(add);
		
		double sub = num1-num2;
		System.out.println(sub);
		
		double mul = num1*num2;
		System.out.println(mul);
		
		double div = num1/num2;
		System.out.println(div);
		
		double moul = add%2;
		System.out.println(moul);
		
		
		
	}

}
