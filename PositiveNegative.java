import java.util.Scanner;

public class PositiveNegative{
  void check(int num){
    if(num > 0){
      System.out.println("Number is Positive!");
    }else{
      System.out.println("Number is Negative!");
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    PositiveNegative obj = new PositiveNegative();
    System.out.println("Enter a number: ");
    int x = sc.nextInt();
    obj.check(x);
    sc.close();
  }

}