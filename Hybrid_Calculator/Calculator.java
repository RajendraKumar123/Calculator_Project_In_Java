
import java.util.*;

public class Calculator extends History{

	public Calculator() {
		System.out.println("");
		System.out.println("-".repeat(10) + " " + "Calculator" + " " + "-".repeat(10)); // prints the title
		System.out.println("");



		while (true) {

			System.out.println("\t1 - Arithematic ");
			System.out.println("\t2 - Trigonometry");
			System.out.println("\t3 - Main Menu");
			System.out.println("");

			Scanner scan = new Scanner(System.in);
			System.out.print("(Calculator) >>>  ");
			String in = scan.nextLine();
			System.out.println("");

			if (in.equals("1")) {

				Interface();
			}

			else if (in.equals("2")) {
				Trigonometry tri = new Trigonometry();
			}

			else if (in.equals("3")) {
				write("-".repeat(10));


				break; // breaks the loop and ands the program execution
			}

			else {
				System.out.println("");
				System.out.println("Invalid Choice");
				System.out.println("");
			}
		}
	}

	public static void Interface() {
		// -------------------------------- Addition
		System.out.println("");
		System.out.println("-".repeat(10) + " " + "Arithematics" + " " + "-".repeat(10)); // prints the title
		System.out.println("");

		common c = new delay();

		Scanner var = new Scanner(System.in);

		while (true) {

			System.out.println("");
     	System.out.println("");
			System.out.println("\t\t1  - Add/Sub ");
			System.out.println("\t\t2  - Multiply");
			System.out.println("\t\t3  - Divide");
			System.out.println("\t\t4  - Factorial");
			System.out.println("\t\t5  - Square");
			System.out.println("\t\t6  - Cube");
			System.out.println("\t\t7  - Power");
			System.out.println("\t\t8  - Log");
			System.out.println("\t\t9  - Square Root");
			System.out.println("\t\t10 - Cube Root");
			System.out.println("\t\t11 - Nth Root");
			System.out.println("\t\t12 - Calculator");
			System.out.println("");
      System.out.println("");


			System.out.print("(Arithematics) >>>  ");
			String in = var.nextLine();

			System.out.println("");

			// checking the input value...

			if (in.equals("1")) {

				add();
				c.run();
			}

			else if (in.equals("2")) {
				mult();
				c.run();
			}

			else if (in.equals("3")) {
				div();
				c.run();
			}

			else if (in.equals("4")) {
				fact();
				c.run();
			}

			else if (in.equals("5")) {

				square();
				c.run();

			} else if (in.equals("6")) {

				cube();
				c.run();

			}

			else if (in.equals("7")) {

				power();
				c.run();

			} else if (in.equals("8")) {

				log();
				c.run();

			}

			else if (in.equals("9")) {
				// power();
				sqRoot();
				c.run();

			}

			 else if (in.equals("10")) {
				cuRoot();
				c.run();
			}

			else if (in.equals("11")) {
				nRoot();
				c.run();
			}

			else if (in.equals("12")) {
				break; // breaks the loop and ands the program execution
			}

			else {
				System.out.println("Invalid Choice");
				System.out.println("");
				c.run();
			}
		}
	}

	public static void add() {
		Scanner var = new Scanner(System.in);

		String data = "";

		System.out.println("(Note  : Type '@' to calculate)");
		System.out.println("Enter the numbers :  ");

		double sum = 0;
		while (true) {
			String n1 = var.nextLine();

			try {
				double i = Double.parseDouble(n1);
				sum += i;
				data += i + "+";
			}

			catch (Exception e) {
				break;
			}
		}

		System.out.println("");
		System.out.println("Sum  :  " + sum);
		write(data + " = " + sum);


	}

	// -------------------------------- Multiplication

	public static void mult() {
		Scanner var = new Scanner(System.in);

		String data = "";

		System.out.println("(Note  : Type '@' to calculate)");
		System.out.println("Enter the numbers :  ");



		double sum = 1;
		while (true) {
			String n1 = var.nextLine();

			try {
				double i = Double.parseDouble(n1);
				sum *= i;
				data += i + " * ";
			}

			catch (Exception e) {
				break;
			}
		}

		System.out.println("");
		System.out.println("Product  :  " + sum);
		write(data + " = " + sum);

	}

	// -------------------------------- Divison

	public static void div() {

		Scanner var = new Scanner(System.in);

		System.out.print("Enter the Divident  :  ");
		double n1 = var.nextDouble();

		System.out.print("Enter the Divisor  :  ");
		double n2 = var.nextDouble();

		System.out.println("");
		System.out.println("Quotient  :  " + n1 / n2);

		write(n1 + " / " + n2 + " = " + n1/n2);

	}

	// -------------------------------- Factorial

	public static void fact() {

		Scanner var = new Scanner(System.in);
		System.out.print("Enter the number  :  ");

		int n = var.nextInt();

		int fac = 1;

		for (int i = 1; i <= n; i++) {
			fac *= i;
		}

		System.out.println("");
		System.out.println("Factorial(" + n + ")" + "  :  " + fac);
		write(n + "! = " + fac);

	}

	// -------------------------------- Power

	public static void power() {

		Scanner var = new Scanner(System.in);

		System.out.print("Enter the number  :  ");
		double n1 = var.nextDouble();

		System.out.print("Enter the Power  :  ");
		int n2 = var.nextInt();

		System.out.println("");
		System.out.println("Power(" + (n1 + " ^ " + n2) + ")  :  " + Math.pow(n1, n2));
		write(n1 + " ^ " + n2 + " = " + Math.pow(n1, n2));

	}

	// -------------------------------- Square Root

	public static void sqRoot() {

		Scanner var = new Scanner(System.in);

		System.out.print("Enter the number  :  ");
		double n = var.nextDouble();

		System.out.println("");
		System.out.println("Square Root(" + n + ") : " + Math.sqrt(n));
		write("Square Root(" + n + ") = " + Math.sqrt(n));

	}

	// -------------------------------- Cube Root
	public static void cuRoot() {

		Scanner var = new Scanner(System.in);

		System.out.print("Enter the number  :  ");
		double n = var.nextDouble();

		System.out.println("");
		System.out.println("Cube Root(" + n + ") : " + Math.cbrt(n));
		write("Cube Root(" + n + ") = " + Math.cbrt(n));

	}

	// -------------------------------- Square
	public static void square() {

		Scanner var = new Scanner(System.in);

		System.out.print("Enter the number  :  ");
		double n = var.nextDouble();

		System.out.println("");
		System.out.println("Square(" + n + ") : " + Math.pow(n, 2));
		write("Square (" + n + ") = " + Math.pow(n, 2));

	}

	// -------------------------------- Cube
	public static void cube() {

		Scanner var = new Scanner(System.in);

		System.out.print("Enter the number  :  ");
		double n = var.nextDouble();

		System.out.println("");
		System.out.println("Cube(" + n + ") : " + Math.pow(n, 3));
		write("Cube (" + n + ") = " + Math.pow(n, 3));

	}

	// -------------------------------- Log
	public static void log() {

		Scanner var = new Scanner(System.in);

		System.out.print("Enter the number  :  ");
		double n = var.nextDouble();

		System.out.println("");
		System.out.println("Log " + "(" + n + ")" + "  :  " + Math.log(n));
		write("Log (" + n + ") = " + Math.log(n));

	}

	// -------------------------------- Nth Root
	public static void nRoot() {

		Scanner var = new Scanner(System.in);

		System.out.print("Enter the numbers  :  ");
		double n1 = var.nextDouble();

		System.out.print("Enter the value of 'n'  :  ");
		double n2 = var.nextDouble();

		System.out.println("");
		System.out.println(n2 + "th Root(" + n1 + ")  :  " + Math.pow(n1, 1.0 / n2));
		write(n1 + " ^ 1.0/" + n2 + "=" + Math.pow(n1, 1.0 / n2));

	}

}
