import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class Quiz {
  Scanner consoleInput = new Scanner(System.in);
  ArrayList <String> score = new ArrayList<String>();
  // this arraylist will track correct and incorrect answers
  int result = 0;

  public void runQuiz () {
  System.out.println("Welcome to my quiz on Pop Culture/Video Games!!");
    try {
        Thread.sleep(1000);
      // sleep so the pacing feels better and not super duper fast
    } catch (InterruptedException exc) {
        System.out.println("Thread interrupted");
    }
  File test = new File ("Questions.txt");
  try (Scanner input = new Scanner(test)){
    while(input.hasNextLine()){ // reads until there are no more lines
      System.out.println(input.nextLine());
      String inputresponse = consoleInput.nextLine(); //player answer
      String outputanswer = input.nextLine();
      if (inputresponse.equalsIgnoreCase(outputanswer)){ // checks if answer is correct
        System.out.println("Correct!");
        score.add("C");
      }
      else { //if answer is incorrect. Plus actual answer
        System.out.println("Incorrect! " + "The correct answer is " + outputanswer);
        score.add("I");
      }
      try {
          Thread.sleep(1000);
      } catch (InterruptedException exc) {
          System.out.println("Thread interrupted");
      }
    }
  } catch (FileNotFoundException fnfe){
    System.out.println("File not found");
  }
}
  public void QuizConclusion(){
    for (int ive = 0; ive < score.size(); ive++){
      if (score.get(ive).equalsIgnoreCase("C")){
        result ++;
      }
    }
    // tallys up the correct answers and outputs a score number
    System.out.println("Congratulations! You have completed the quiz!");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException exc) {
        System.out.println("Thread interrupted");
    }
    System.out.println("Your score was: " + result + "/" + score.size());
    // final score
  }
}