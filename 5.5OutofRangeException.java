public class OutofRangeException extends Exception {
  int min;
  int max;

  public OutofRangeException(int startmin, int startmax){
    min = startmin;
    max = startmax;
  }

  @Override
  public String toString(){
    return "The stat is out of range and needs to be between " + min + " and " + max;
  }
}