import java.io.*;
import javax.sound.sampled.*;

class Main {
  public static void main(String[] args) {
    try{
      FileInputStream newFile = new FileInputStream("MySong.mp3");
    } catch (FileNotFoundException exc){
      System.out.println("File not found");
    }
    try{
      AudioFileFormat audFormat = AudioSystem.getAudioFileFormat(new File("MySong.mp3"));
    } catch (UnsupportedAudioFileException exc){
      System.out.println("File not supported");
    } catch(IOException exc){
      System.out.println("IOException");
    }
 
    
    System.out.println("Countdown!");
    for (int i = 3; i>0; i--) {
      try {
          Thread.sleep(1000);
      } catch (InterruptedException exc) {
          System.out.println("Thread interrupted");
      }
      System.out.println(i);
    }
    try {
        Thread.sleep(1000);
    } catch (InterruptedException exc) {
        System.out.println("Thread interrupted");
    }
    System.out.println("Blastoff!");
  }
}