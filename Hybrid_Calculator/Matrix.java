
import java.util.*;

public class Matrix extends History{

	public Matrix() {


		System.out.println("");
	    System.out.println("-".repeat(10) + " " + "Matrix" + " " + "-".repeat(10)); // prints the title
	    System.out.println("");

	    Scanner var = new Scanner(System.in);

			common c = new delay();

	    while (true) {

	      System.out.println("\t1 - Add ");
	      System.out.println("\t2 - Sub ");
	      System.out.println("\t3 - Multiply");
	      System.out.println("\t4 - Transpose");
	      System.out.println("\t5 - Main Menu");



	      System.out.println("");

	      System.out.print("(Matrix) >>>  ");
	      String in = var.nextLine();

	      System.out.println("");

	      // checking the input value...

	      if (in.equals("1")) {

	    	  add();
					c.run();
	      }

	      else if (in.equals("2")) {
	    	  subtract();
					c.run();
	    	  }

	      else if (in.equals("3")) {
	    	  multiply();
					c.run();
	      }
	      else if (in.equals("4")) {
	    	  Transpose();
					c.run();
	    	  }

	      else if (in.equals("5")) {
	        write("-".repeat(10));

	        break; // breaks the loop and ands the program execution
	      }

	      else {
	        System.out.println("Invalid Choice");
					System.out.println("");
					c.run();
	      }}

	}

  public static void add() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of matrices");
    int n = sc.nextInt();
    System.out.println("");

    System.out.println("Enter the dimension of matrix");
    int a = sc.nextInt();
    System.out.println("");

		System.out.println("Enter the matrices");
    System.out.println("");

    int ans[][] = new int[a][a];
    for (int i = 1; i <= n; i++) {
      int A[][] = new int[a][a];
      for (int j = 0; j < a; j++) {
        for (int k = 0; k < a; k++) {
          A[j][k] = sc.nextInt();
        }

      }
      System.out.println("");
      for (int j = 0; j < a; j++) {
        for (int k = 0; k < a; k++) {
          ans[j][k] = ans[j][k] + A[j][k];
        }
      }
    }

		String data = "";
    System.out.println("");
		System.out.println("Sum  :  ");
		System.out.println("");
    for (int j = 0; j < a; j++) {
      for (int k = 0; k < a; k++) {
        System.out.print(ans[j][k] + "\t");
				data += ans[j][k] + "\t";
      }
			data += "\n";
      System.out.println();
    }
		write("Sum  : ");
		write(data);
		System.out.println("");
  }

  public static void subtract() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of matrices");
    int n = sc.nextInt();
		System.out.println("");
    System.out.println("Enter the dimension of matrix");
    int a = sc.nextInt();
		System.out.println("");
		System.out.println("Enter the matrices");
    System.out.println("");
    int ans[][] = new int[a][a];

    for (int i = 1; i <= n; i++) {
      int A[][] = new int[a][a];
      for (int j = 0; j < a; j++) {
        for (int k = 0; k < a; k++) {
          A[j][k] = sc.nextInt();

        }

      }
      System.out.println("");
      for (int j = 0; j < a; j++) {
        for (int k = 0; k < a; k++) {
          if (i > 1) {
            A[j][k] = -A[j][k];
          }
          ans[j][k] = ans[j][k] + A[j][k];
        }
      }
    }
		System.out.println("");
		System.out.println("Difference  :  ");
    System.out.println("");

		String data = "";
    for (int j = 0; j < a; j++) {
      for (int k = 0; k < a; k++) {
        System.out.print(ans[j][k] + "\t");
				data += ans[j][k] + "\t";
      }
      System.out.println();
			data += "\n";
    }
		write("Difference  : ");
		write(data);
		System.out.println("");

  }

  public static void multiply() {
		Scanner sc = new Scanner(System.in);
    System.out.println("Enter the dimension");
    int a = sc.nextInt();
		System.out.println("");
		System.out.println("Enter the matrices");
		System.out.println("");
    int A[][] = new int[a][a];
    int B[][] = new int[a][a];
    int ans[][] = new int[a][a];
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a; j++) {
        A[i][j] = sc.nextInt();
      }

    }
    System.out.println("");

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a; j++) {
        B[i][j] = sc.nextInt();
      }

    }

    System.out.println("");
		System.out.println("Product  :  ");

    // creating another matrix to store the multiplication of two matrices
    int c[][] = new int[a][a]; // 3 rows and 3 columns

		String data = "";
    // multiplying and printing multiplication of 2 matrices
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a; j++) {
        c[i][j] = 0;
        for (int k = 0; k < a; k++) {
          c[i][j] += A[i][k] * B[k][j];
        } // end of k loop
        System.out.print(c[i][j] + "\t"); // printing matrix element
				data += c[i][j] + "\t";
      } // end of j loop
      System.out.println();// new line
			data += "\n";
    }
		write("Product  : ");
		write(data);

		System.out.println("");
  }

  public static void Transpose() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the dimensions");
    int a = sc.nextInt();
		System.out.println("");
		System.out.println("Enter the matrices");
		System.out.println("");

    int A[][] = new int[a][a];
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a; j++) {
        A[i][j] = sc.nextInt();

      }
    }

		String data = "";
		System.out.println("");
		System.out.println("Transpose  :  ");
		System.out.println();
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a; j++) {
        System.out.print(A[j][i] + "\t");
				data += A[j][i] + "\t";
      }
      System.out.println();
			data += "\n";

    }
		write("Transpose  : ");
		write(data);
		System.out.println();


	}
}
