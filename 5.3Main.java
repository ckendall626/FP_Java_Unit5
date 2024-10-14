import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Main {
  public static void main(String[] args) {
      writeToFile("NoteToFrewen.txt", "Done with #1");
      append();
      testPrintf();
  }


  public static void append() {
    // Gets the current date and time, then creates an object to set the right format.
    LocalDateTime dateTime = LocalDateTime.now(); 
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    try {
      PrintWriter out = new PrintWriter(new FileWriter("appendToMe.txt", true));
      out.println(dateTime.format(formatter) + " Howdy class");
      out.close();
    } catch (FileNotFoundException fex) {
      System.out.println("unable to write to file - file not found");
    } catch (IOException sce){
      System.out.println("IOException");
    }

  }

  public static void testPrintf() {
    //use a for loop along with two arrays. You should have only one printf line.
    int[] years = new int[3];
    years[0] = 1978;
    years[1] = 1979;
    years[2] = 1980; 
    double[] percentages = new double[3];
    percentages[0] = 7.63;
    percentages [1] = 11.25;
    percentages[2] = 13.55;
    for (int nj = 0; nj < 3; nj++){
      System.out.printf("The inflation rate in %d is %05.2f\n", years[nj], percentages[nj]);
    }

  }
    public static void writeToFile(String filename, String text){
    try {
      PrintWriter thefile = new PrintWriter(filename);
      thefile.println(text);
      thefile.close();
    } catch (FileNotFoundException ex) {
      System.out.println("unable to write to file - file not found");
    }
  }
}