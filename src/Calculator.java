
/**
 * @author Ajay Kumar
 * This class is used for calculator.
 */
public class Calculator {

	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int sub(int a, int b)
	{
		return a-b;
	}
	
	public int mult(int a, int b)
	{
		return a*b;
	}
	
	public int div(int a, int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) {
		
		Calculator calc= new Calculator();
		System.out.println(calc.add(10, 20));
		System.out.println(calc.sub(30, 20));
		System.out.println(calc.mult(10, 20));
		System.out.println(calc.div(20, 2));
	}

}
