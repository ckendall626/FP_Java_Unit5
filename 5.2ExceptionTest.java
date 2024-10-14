import java.io.*;
import java.util.*;

public class ExceptionTest {
  
  public static void spawnExceptions() {
    try {FileInputStream fStream = new FileInputStream("prep.txt");
    fStream.read();
    String filename2 = "prep2.txt";
    File file2 = new File(filename2);
    Scanner input = new Scanner(file2);
        } catch (FileNotFoundException exc){
      System.out.println("FileNotFoundException");
        } catch (IOException exc){
      System.out.println("IOException");
        } catch (SecurityException exc){
      System.out.println("SecurityException");
        } catch (NullPointerException exc){
      System.out.println("NullPointerException");
        }
  }

  public static void divideThree() throws ArithmeticException {
    Scanner consoleInput = new Scanner(System.in);
    int divisor;
    System.out.println("What number should we divide 3 by?");
    if (!consoleInput.hasNextInt()) {
      System.out.println("That's not a number! See you around!");
      return;
    }
    divisor = consoleInput.nextInt();
    if (divisor != 0){
      System.out.println("Okay, let's divide by " + divisor);
    System.out.println("The quotient is " + 3 / divisor);
    }
    else{
      System.out.println("Uh oh, it looks like your number " + divisor + " gave a problem!");
    }
   
      
  }

}