import java.util.Random;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		double firstNum, secondNumber, result;
		int choosing, factorial;
		do {
			choosing = Menu();

			switch (choosing) {
			case 1:
				firstNum = theDecimalNumber();
				secondNumber = theDecimalNumber();
				result = addition(firstNum, secondNumber);
				finalResult(result);
				break;

			case 2:
				firstNum = theDecimalNumber();
				secondNumber = theDecimalNumber();
				result = substraction(firstNum, secondNumber);
				finalResult(result);

				break;
			case 3:
				firstNum = theDecimalNumber();
				secondNumber = theDecimalNumber();
				result = multiplication(firstNum, secondNumber);
				finalResult(result);

				break;
			case 4:
				firstNum = theDecimalNumber();
				secondNumber = theDecimalNumber();
				result = division(firstNum, secondNumber);
				finalResult(result);

				break;
			case 5:
				factorial = integerNumber();
				result = calculateFactorial(factorial);
				finalResult(result);

				break;
			case 6:
				factorial = integerNumber();
				result = randomNumber(factorial);
				finalResult(result);

				break;
			default:
				System.out.println("Thank you for choosing us :) ");
				break;
			}

		} while (choosing != 7);
		System.out.println("Quiting...");
	}

	public static void theMenu() {
		System.out.println("");
		System.out.println(
				"1-Addition\n2-Substraction\n3-Multiplication\n4-Division\n" + "5-Factorial\n6-Random\n7-Exit");
	}

	public static int Menu() {
		Scanner scan = new Scanner(System.in);
		theMenu();

		int number = scan.nextInt();

		while (number < 1 || number > 7) {
			theMenu();
			System.out.println("\nPlease enter valid request!!!");
			number = scan.nextInt();
		}
		return number;
	}

	public static double theDecimalNumber() {
		Scanner scan = new Scanner(System.in);
		double number;
		System.out.println("Enter the decimal number : ");
		number = scan.nextInt();
		return number;

	}

	public static double addition(double num1, double num2) {
		return num1 + num2;

	}

	public static double substraction(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiplication(double num1, double num2) {
		return num1 * num2;
	}

	public static double division(double num1, double num2) {
		return num1 / num2;
	}

	public static int integerNumber() {
		Scanner scan = new Scanner(System.in);
		int sayi;
		System.out.println("Enter the integer : ");
		sayi = scan.nextInt();
		return sayi;
	}

	public static int calculateFactorial(int num) {

		int factorial = 1;
		for (int i = 1; i <= num; i++)
			factorial *= i;
		return factorial;

	}

	public static int randomNumber(int num) {
		Random rdn = new Random();
		return rdn.nextInt(num) + 1;
	}

	public static void finalResult(double num) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Press 'Enter' to see the result.");
		scan.nextLine();

		System.out.println("The result is " + num);
	}

}