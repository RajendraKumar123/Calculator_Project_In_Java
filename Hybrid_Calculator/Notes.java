

import java.io.*;
import java.util.*;

public class Notes extends History{

  // -----------------------------------------------------------------------------------
  public static void Writer(String fileName, String content, boolean wOra) { // method that writes data into files
                                                                             // wOra(true) -> Appends
                                                                             // wOra(false) -> Over Writes

    try {
      File file = new File("Notes.txt"); // opening file
      FileOutputStream fileWriter = new FileOutputStream(file, wOra); // creating writer

      PrintWriter appender = new PrintWriter(fileWriter);

      appender.println(content);
      appender.close(); // closing the writer
    }

    catch (IOException e) {
      e.printStackTrace();
    } // exception statement for the above try

    System.out.println("");
    System.out.println("");
    System.out.println("-".repeat(5) + " Changes Saved " + "-".repeat(5));
    System.out.println("");
    System.out.println("");

  }

  // -----------------------------------------------------------------------------------
  public static void Reader(String fileName) throws FileNotFoundException { // method that show all data in the note

    System.out.println("");
    System.out.println("");
    System.out.println("-".repeat(10) + " Notes " + "-".repeat(10));
    System.out.println("");

    File file = new File("Notes.txt"); // opening file
    Scanner reader = new Scanner(file);

    while (reader.hasNextLine()) {
      System.out.println(reader.nextLine());
    }
    reader.close();

    System.out.println("-".repeat(30));
    System.out.println("");
    System.out.println("");


  }

  public static void Inteface() throws FileNotFoundException {

    Scanner inputNum = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    common c = new delay();

    while (true) {

      System.out.println("");
      System.out.println("");
      System.out.println("\t1 - Clear and Write");
      System.out.println("\t2 - Add Notes");
      System.out.println("\t3 - Read Notes");
      System.out.println("\t4 - Clear Notes");
      System.out.println("\t5 - Main Menu");
      System.out.println("");

      System.out.print("(Notes) >>>  ");
      String choice = inputNum.nextLine();
      System.out.println("");
      System.out.println("");

      if (choice.equals("1")) {
        System.out.print("(Clear and Write) >>>  ");
        String content = inputString.nextLine();

        Writer("NotesFile", content, false);
        write("Notes Modified");
      }

      else if (choice.equals("2")) {
        System.out.print("(Add Note) >>>  ");
        String content = inputString.nextLine();

        Writer("NotesFile", content, true);
        write("Notes Modified");
      }

      else if (choice.equals("3")) {
        Reader("NotesFile");
        write("Notes read !");
        c.run();
      }

      else if (choice.equals("4")) {
        Writer("NotesFile", "", false);
        write("Notes Modified");
      }

      else if (choice.equals("5")) {
        write("-".repeat(10));
        break;
      }

      else {
        System.out.println("Invalid Choice !");
      }
    }

  }

}
