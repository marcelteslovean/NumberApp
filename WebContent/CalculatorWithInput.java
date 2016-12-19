package calculatorWithInput;

import java.util.Scanner;

public class CalculatorWithInput {
	
	public static void main (String [] args ){
		calculator();
	}
	
	public static void calculator(){
		Scanner input = new Scanner(System.in);
		double n1, n2, addition, subtraction, multiplication, division;
		String operator;
		System.out.println("Please enter your first number");
		n1 = input.nextInt();
		System.out.println("Please enter your second number");
		n2 = input.nextInt();
		System.out.println("Please enter whether you'd like to 'add', 'subtract', 'multiply' or 'divide'?" );
		addition = n1 + n2;
		subtraction = n1 - n2;
		multiplication = n1 * n2;
		division = n1 / n2;
		operator = input.next();
		if (operator.equals("add")){
			System.out.println("Your Result: ");
			System.out.println(n1 + " + " + n2 + " = " + addition);
		}
		else if(operator.equals("subtract")){
			System.out.println("Your Result: ");
			System.out.println(n1 + " - " + n2 + " = " + subtraction);
		}
		else if (operator.equals("multiply")){
			System.out.println("Your Result: ");
			System.out.println(n1 + " * " + n2 + " = " + multiplication);
		}
		else if (operator.equals("divide")){
			System.out.println("Your Result: ");
			System.out.println(n1 + " / " + n2 + " = " + division);
		}
		input.close();
	}

}
