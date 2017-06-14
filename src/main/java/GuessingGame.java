import java.util.Scanner;

public class GuessingGame {
    public static int attempts;
    public static String guess;
    public static boolean correct;
    public static Scanner Scan = new Scanner(System.in);
    public static void main(String[] args) {
      System.out.printf("Administrator Setup Wizard\n");
      System.out.printf("--------------------------\n");
      System.out.printf("What type of item should go in the jar?  ");
      String item = Scan.nextLine();
      System.out.printf("What is the maximum amount of %s in the jar?  ", item);
      int maxNumberOfItems = Integer.parseInt(Scan.nextLine());
      Jar jar = new Jar(item, maxNumberOfItems);
      System.out.printf("Guessing Game\n");
      System.out.printf("-------------\n");
      
      do {
        System.out.printf("How many %s are in the jar? Make a guess between 1 and %d:  ", item, maxNumberOfItems);
        guess = Scan.nextLine();
        correct = jar.isNumber(Integer.parseInt(guess));
        ++attempts;        
      } while(correct == false); {
        System.out.printf("How many %s are in the jar? Make a guess between 1 and %d:  ", item, maxNumberOfItems);
        guess = Scan.nextLine();
        correct = jar.isNumber(Integer.parseInt(guess));
        ++attempts;
      }
      System.out.printf("You got it in %d attempts", attempts);
    }
}