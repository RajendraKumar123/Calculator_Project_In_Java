import java.util.Scanner;

public class Mass extends History {
	public Mass() {

		System.out.println("");
		System.out.println("-".repeat(10) + " " + " Mass " + " " + "-".repeat(10)); // prints the title
		System.out.println("");

		common c = new delay();

		while (true) {

			Scanner var = new Scanner(System.in);

			System.out.println("");
			System.out.println("\t\t1 - Gram\tto\tKilogram ");
			System.out.println("\t\t2 - Kilogram\tto\tGram ");
			System.out.println("\t\t3 - Milligram\tto\tKilogram ");
			System.out.println("\t\t4 - Kilogram\tto\tMilligram ");
			System.out.println("\t\t5 - Kilogram\tto\tPound ");
			System.out.println("\t\t6 - Pound\tto\tKilogram ");
			System.out.println("\t\t7 - Kilogram\tto\tTonne ");
			System.out.println("\t\t8 - Kilogram\tto\tQuintillion ");
			System.out.println("\t\t9 - Conversions ");

			System.out.println("");

			System.out.print("(Mass) >>>  ");
			String in = var.nextLine();

			System.out.println("");

			// checking the input value...

			if (in.equals("1")) {
                try {
				System.out.print("Enter The Mass in grams  :  ");
				double x = var.nextDouble();
				System.out.println("");
				String data = x + " In Kilograms is " + gTokg(x);
				System.out.println(data);
				write(data);
				c.run();
                }
				catch(Exception e){
					System.out.println("Enter only numbers");
				} 

			}

			else if (in.equals("2")) {
				try {

				System.out.print("Enter The Mass in Kilograms  :  ");
				double x = var.nextDouble();
				System.out.println("");
				String data = x + " In Kilograms  is " + kgTog(x);
				System.out.println(data);
				write(data);
				c.run();
				}
				catch(Exception e){
					System.out.println("Enter only numbers");
				} 

			}

			else if (in.equals("3")) {
				try {

				System.out.print("Enter The Mass in Milligrams  :  ");
				double x = var.nextDouble();
				System.out.println("");
				String data = x + " In Kilograms is " + mgTokg(x);
				System.out.println(data);
				write(data);
				c.run();
				}
				catch(Exception e){
					System.out.println("Enter only numbers");
				} 
			}

			else if (in.equals("4")) {
				try {
				System.out.print("Enter The Mass in Kilograms  :  ");
				double x = var.nextDouble();
				System.out.println("");
				String data = x + " In Milligrams is " + kgTomg(x);
				System.out.println(data);
				write(data);
				c.run();
				}
				catch(Exception e){
					System.out.println("Enter only numbers");
				} 
			}

			else if (in.equals("5")) {
				try {
				System.out.print("Enter The Mass in Kilograms  :  ");
				double x = var.nextDouble();
				System.out.println("");
				String data = x + "In Pounds is " + kgTolb(x);
				System.out.println(data);
				write(data);
				c.run();
				}
				catch(Exception e){
					System.out.println("Enter only numbers");
				} 
			}

			else if (in.equals("6")) {
				try {
				System.out.print("Enter The Mass in Kilograms  :  ");
				double x = var.nextDouble();
				System.out.println("");
				String data = x + "In kiloMeters is " + lbTokg(x);
				System.out.println(data);
				write(data);
				c.run();
				}
				catch(Exception e){
					System.out.println("Enter only numbers");
				} 

			}

			else if (in.equals("7")) {
                try {
				System.out.print("Enter The Mass in Tonnes  :  ");
				double x = var.nextDouble();
				System.out.println("");
				String data = x + " In Kilograms is " + tonTokg(x);
				System.out.println(data);
				write(data);
				c.run();
                }
				catch(Exception e){
					System.out.println("Enter only numbers");
				} 
			}

			else if (in.equals("8")) {
				try {
				System.out.print("Enter The Mass in Quintanls  :  ");
				double x = var.nextDouble();
				System.out.println("");
				String data = x + "In Kilograms is " + kgTolb(x);
				System.out.println(data);
				write(data);
				c.run();
				}
				catch(Exception e){
					System.out.println("Enter only numbers");
				} 
			}

			else if (in.equals("9")) {
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

	public static double gTokg(double g) {
		double kg = g * 1000;
		return kg;
	}

	public static double kgTog(double g) {
		double kg = g / 1000;
		return kg;
	}

	public static double lbTokg(double g) {
		double kg = g / 2.205;
		return kg;
	}

	public static double kgTolb(double g) {
		double lb = g * 2.205;
		return lb;
	}

	public static double mgTokg(double mg) {
		double kg = mg / (Math.pow(10.0, 6.0));
		return kg;
	}

	public static double kgTomg(double mg) {
		double kg = mg * (Math.pow(10.0, 6.0));
		return kg;
	}

	public static double tonTokg(double ton) {
		double kg = ton * 1000.0;
		return kg;
	}

	public static double qntTokg(double qnt) {
		double kg = qnt * 100.0;
		return kg;
	}
}