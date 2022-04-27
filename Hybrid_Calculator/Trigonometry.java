
import java.util.Scanner;

public class Trigonometry extends History {

	public Trigonometry() {

		System.out.println("");
		System.out.println("-".repeat(10) + " " + "Trignometry" + " " + "-".repeat(10)); // prints the title
		System.out.println("");

		common c = new delay();

		while (true) {

			Scanner var = new Scanner(System.in);

			System.out.println("");
			System.out.println("\t\t1 - Sin");
			System.out.println("\t\t2 - Cos");
			System.out.println("\t\t3 - Tan");
			System.out.println("\t\t4 - Sininv");
			System.out.println("\t\t5 - Cosinv");
			System.out.println("\t\t6 - Taninv");
			System.out.println("\t\t7 - Calculator");

			System.out.println("");

			System.out.print("(Trignometry) >>>  ");
			String in = var.nextLine();

			System.out.println("");

			// checking the input value...

			if (in.equals("1")) {

				System.out.print("Enter The angle (Degree) :  ");
				double x = var.nextDouble();
				System.out.println("");
				sin(x);
				c.run();

			}

			else if (in.equals("2")) {

				System.out.print("Enter The angle (Degree) :  ");
				double x = var.nextDouble();
				System.out.println("");
				cos(x);
				c.run();

			} else if (in.equals("3")) {

				System.out.print("Enter The angle (Degree) :  ");
				double x = var.nextDouble();
				System.out.println("");
				tan(x);
				c.run();

			} else if (in.equals("4")) {

				System.out.print("Enter The value  :  ");
				double x = var.nextDouble();
				System.out.println("");
				sininv(x);
				c.run();

			} else if (in.equals("5")) {

				System.out.print("Enter The value  :  ");
				double x = var.nextDouble();
				System.out.println("");
				cosinv(x);
				c.run();

			} else if (in.equals("6")) {

				System.out.print("Enter The value  :  ");
				double x = var.nextDouble();
				System.out.println("");
				taninv(x);
				c.run();

			}

			else if (in.equals("7")) {
				write("-".repeat(10));

				break; // breaks the loop and ands the program execution
			}

			else {
				System.out.println("Invalid Choice");
				System.out.println("");
				c.run();
			}
		}
	}

	public static void sin(double num) {
		String data = "Sin(" + num + ") = " + Math.sin(num * Math.PI / 180);
		System.out.println(data);
		write(data);
	}

	public static void cos(double num) {
		String data = "Cos(" + num + ") = " + Math.cos(num * Math.PI / 180);
		System.out.println(data);
		write(data);
	}

	public static void tan(double num) {
		String data = "Tan(" + num + ") = " + Math.tan(num * Math.PI / 180);
		System.out.println(data);
		write(data);
	}

	public static void sininv(double num) {
		String data = "Sininv(" + num + ") = " + (Math.asin(num) * (180 / Math.PI)) + "\u00B0";
		System.out.println(data);
		write(data);
	}

	public static void cosinv(double num) {
		String data = "Cosinv(" + num + ") = " + (Math.acos(num) * (180 / Math.PI)) + "\u00B0";
		System.out.println(data);
		write(data);
	}

	public static void taninv(double num) {
		String data = "Taninv(" + num + ") = " + (Math.atan(num) * (180 / Math.PI)) + "\u00B0";
		System.out.println(data);
		write(data);
	}
}
