
import java.util.Scanner;

public class Convert {

	public Convert() {

		System.out.println("");
		System.out.println("-".repeat(10) + " " + " Convert " + " " + "-".repeat(10)); // prints the title
		System.out.println("");

		Scanner var = new Scanner(System.in);

		while (true) {

			System.out.println("\t1 - Length");
			System.out.println("\t2 - Mass");
			System.out.println("\t3 - Currency");
			System.out.println("\t4 - Main Menu");

			System.out.println("");

			System.out.print("(Convert) >>>  ");
			String in = var.nextLine();

			System.out.println("");

			// checking the input value...

			if (in.equals("1")) {

				Length le = new Length();
			}

			else if (in.equals("2")) {
				Mass m = new Mass();
			}

			else if (in.equals("3")) {
				Currency c = new Currency();
			}

			else if (in.equals("4")) {


				break; // breaks the loop and ands the program execution
			}

			else {
				System.out.println("Invalid Choice");
				System.out.println("");
			}
		}
	}
}
