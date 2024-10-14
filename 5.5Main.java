class Main {
  public static void main(String[] args) {
    
    try { 
      Player p = new Player("goat", 10, 10);
      System.out.println(p.name + ", stats: " + p.speed + " & " + p.accuracy);
    } catch (OutofRangeException ore) {
      System.out.print(ore.toString());
    }
    
  }
}