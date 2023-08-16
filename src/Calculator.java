
public class Calculator {

	public void add()
	{
		System.out.println("Adding some number.");
	}
	
	public void sub()
	{
		System.out.println("Subtract some number.");
	}
	
	public void mult()
	{
		System.out.println("Multiply some number.");
	}
	
	public void div()
	{
		System.out.println("Divide some number.");
	}
	
	public static void main(String[] args) {
		
		Calculator calc= new Calculator();
		calc.add();
		calc.div();
		calc.sub();
		calc.mult();

	}

}
