import java.util.Scanner;
import java.io.*;
  import java.util.ArrayList;

class Main {
  
  public static void main(String[] args) {
    ArrayList <String> list = new ArrayList <String>();
    list.add("Kaitlyn");
    list.add("Haley");
    list.add("Sulivan");
    list.add("Pascual");
    String specialString;

    for (int ksp = 1; ksp < list.size(); ksp++){
      specialString = list.get(ksp);
      if (ksp == list.size() - 1){
        ksp = -1;
      }
      System.out.println(specialString);
    }
    int counter = 1; 
    
    System.out.println("Hello world!");
    File ive = new File ("Roster.txt");
    try (Scanner input = new Scanner(ive)){
      while(input.hasNextLine()){
        counter ++;
      }
    } catch (FileNotFoundException fnfe){
      System.out.println("File not found");
    }
  }

}