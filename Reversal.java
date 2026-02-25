import java.util.Scanner;
public class Reversal {
  int digit;
  int reverse = 0;
  int reverseNumber(int num){
    while(num != 0){
      digit = num % 10;
      reverse = reverse * 10 + digit;
      num = num / 10;
    }

    return reverse;
  }

  public static void main(String[] args){
    Reversal obj = new Reversal();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int x = sc.nextInt();
    int result = obj.reverseNumber(x);
    System.out.println("Before reversal = " + x + "\nAfter Reversal = " + result);
    sc.close();
  }

}
