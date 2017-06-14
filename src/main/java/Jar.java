public class Jar {
private int number;  
  public Jar(String item, int maxAllowedItems) {
    number = RandomGen.main(maxAllowedItems);
  }
  public boolean isNumber(int guess) {
    if(guess == number) {
      return true;
    } else {
      return false;
    }
  }
  
}