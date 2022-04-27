
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HyC extends History{

	public static void main(String[] args) throws FileNotFoundException{

		System.out.println("");
		System.out.println("-".repeat(10) + " " + "Hybrid Calculator" + " " + "-".repeat(10)); // prints the title
		System.out.println("");

		Scanner var = new Scanner(System.in);
		Notes not = new Notes();
		common c = new delay();


		while (true) {

			System.out.println("");
			System.out.println("1 - Calculation");
			System.out.println("2 - Matrix");
			System.out.println("3 - Conversions");
			System.out.println("4 - History");
			System.out.println("5 - Notes");
			System.out.println("6 - Exit");

			System.out.println("");

			System.out.print("(Main Menu) >>>  ");
			char in = var.next().charAt(0);

			System.out.println("");

			// checking the input value...

			if (in == '1') {
				Calculator cal = new Calculator();
			}

			else if (in == '2') {
				Matrix mat = new Matrix();
			}

			else if (in == '3') {

				Convert con = new Convert();

			}

			else if (in == '4') {
				Inteface();

			}

			else if (in == '5') {
				Scanner var2 = new Scanner(System.in);
				System.out.print("Enter the Pasword  :  ");
				String password = var2.nextLine();

				if (password.equalsIgnoreCase("arahy")){

					try {
						not.Inteface();
					}

					catch (FileNotFoundException e) {
							e.printStackTrace();
					}
				}

				else{
					System.out.println("");
					System.out.println("Access Denied, Incorrect Password !");
					System.out.println("");
					c.run();
				}

			}

			else if (in == '6') {
				write("-".repeat(30));
				break; // breaks the loop and ands the program execution
			}

			else {
				System.out.println("Invalid Choice");
			}

		}

	}
}
