package MyCalPkg;

public class MainCalculator {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		int sum=calc.addition(10,20);
		System.out.println("Addition is"+sum);
		int difference=calc.subtraction(10,20);
		System.out.println("Subtraction is"+difference);
		// TODO Auto-generated method stub

	}

}
