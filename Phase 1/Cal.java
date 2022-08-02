package Calculator;

import java.util.Scanner;

public class Cal {
	
	public  double methodAdd(double n1 ,double n2) {
		double a = n1+n2;
		return a;	
	}
	public double methodSub(double n1 ,double n2) {
		double b = n1-n2;
		return b;	
	}
	public  double methodMul(double n1 ,double n2) {
		double c = n1*n2;
		return c;	
	}
	public  double methodDiv(double n1 ,double n2) {
		double d = n1/n2;
		return d;	
	}
	public void methodDisplay(double r1 ,double r2,double r3,double r4) {
		System.out.println("Result of Addition operation: "+ r1);
		System.out.println("Result of Sub operation: "+ r2);
		System.out.println("Result of Product operation: "+ r3);
		System.out.println("Result of Division85 operation: "+ r4);
	}
	public static void main(String[] args) {
		double n1,n2;
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		n1=ab.nextDouble();
		n2=ab.nextDouble();
		Cal Obj = new Cal();
		double r1= Obj.methodAdd(n1, n2);
		double r2= Obj.methodSub(n1,n2);
		double r3= Obj.methodMul(n1,n2);
		double r4= Obj.methodDiv(n1,n2);
		Obj.methodDisplay(r1, r2, r3, r4);
		
		
	}
}
