import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // TODO: Problem 1
    System.out.println("Enter two integers: ");
    int x = sc.nextInt();
    int y = sc.nextInt();
    
    if (y==0){
      System.out.println("Arithmetic Error");
    } else {
      double ratio = (double) x/y;
      if (1<ratio && ratio<=8) {
        System.out.println("Ratio OK");
      }
    }


    // TODO: Problem 2
    System.out.println("Enter two integers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    if (b==0) {
      System.out.println("Arithmetic Error");
    } else {
      if ((a%b)==0){
        System.out.println("Is a factor");
      }
    }


    // TODO: Problem 3
    System.out.println("Enter a number in the fifties: ");
    int num = sc.nextInt();

    if (num <= 59 && num >= 50){
      System.out.println("Your number is " + num);
    } else {
      System.out.println("That's not in the fifties!");
      num = 55;
      System.out.println("Your number is " + num);
    }


    // TODO: Problem 4
    System.out.println("Enter two numbers: ");
    x = sc.nextInt();
    y = sc.nextInt();

    if (y <= 9 || x > 2 && x*y>10){
      System.out.println("pass");
    }
  }


  // TODO: In-class assignment
  // Create a method that takes in two Rectangles and returns
  // true if they are equal, and false otherwise.  Two
  // Rectangles are considered equal if their widths are equal,
  // and if their lengths are equal.
  public static boolean rectEqual(Rectangle r1, Rectangle r2)
  {
    if ((r1.getWidth() == r2.getWidth()) && (r1.getLength() == r2.getLength())) {
      return true;
    }
    return false;
  }
}
