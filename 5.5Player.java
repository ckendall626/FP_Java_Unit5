public class Player{
  public final String name;
  public final int accuracy;
  public final int speed;

  public Player (String startname, int startaccuracy, int startspeed) throws OutofRangeException {
    if (startaccuracy > 0 && startaccuracy < 1){
      if (startspeed > 0 && startspeed < 1){
        name = startname;
        accuracy = startaccuracy;
        speed = startspeed;
      }
      else {
        throw new OutofRangeException(0, 1);
      }
      
    }
    else {
      System.out.println("Accuracy is out of range");
      throw new OutofRangeException (0, 1);
    }
  }
  }