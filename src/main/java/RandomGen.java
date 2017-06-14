import java.util.Random;


public class RandomGen {
  public static int main(int maxAllowedItems) {
    Random random = new Random();
    int maxItemsAllowed = maxAllowedItems;
    int someNumber = random.nextInt(maxItemsAllowed);
    ++someNumber;
    return someNumber;
  }
}