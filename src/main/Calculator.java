package main;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		boolean moreMathPlz = true;
		Scanner input = new Scanner(System.in);

		while (moreMathPlz) {
			System.out.println("Enter first number: ");
			double firstNum = input.nextDouble();
			System.out.println("Enter second number: ");
			double secondNum = input.nextDouble();
			input.nextLine(); //clearing line input for next String
			System.out.println("Enter operator (+, -, /, *, square): ");
			String operator = input.nextLine();

			// System.out.println(firstNum + operator + secondNum);

			double results;

			switch (operator) {
			case "+":
				results = firstNum + secondNum;
				System.out.println(firstNum + operator + secondNum + " = " + results);
				break;
			case "-":
				results = firstNum - secondNum;
				System.out.println(firstNum + operator + secondNum + " = " + results);
				break;
			case "/":
				results = firstNum / secondNum;
				System.out.println(firstNum + operator + secondNum + " = " + results);
				break;
			case "*":
				results = firstNum * secondNum;
				System.out.println(firstNum + operator + secondNum + " = " + results);
				break;
			case "square":
				results = firstNum * firstNum;
				System.out.println(firstNum + " squared = " + results);
				break;
			default:
				System.out.println("Unrecognized operation, please try again.");
				continue;
			}


			System.out.println("\nCalculate again? (y/n): ");
			String response = input.nextLine();

			if (!response.equalsIgnoreCase("y")) {
				moreMathPlz = false;
			}

		}
		System.out.println("Bye!");
		input.close();
	}

}
