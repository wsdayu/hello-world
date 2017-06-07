package test;

interface Lambda{

	double sum(double d, double y);
}

public class LambdaTest {

	public static void main(String args[]){
		
		Lambda lam = (a,b) -> {return a+b; };
		
		double sum = lam.sum(10.2,2.3);
		
		System.out.println("拉姆达表达式求值：sum = " + sum);
		
		System.out.println("args = " + args[0]);
	}
}
