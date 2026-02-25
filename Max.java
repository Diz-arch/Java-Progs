import java.util.Scanner;

public class Max {
  int checkMax(int a, int b, int c){
    if(a > b && a > c){
      return a;
    }else if(b > a && b > c){
      return b;
    }else{
      return c;
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Max obj = new Max();
    System.out.println("Enter value of a: ");
    int a = sc.nextInt();
    System.out.println("Enter value of b: ");
    int b = sc.nextInt();
    System.out.println("Enter value of c: ");
    int c = sc.nextInt();
    int result = obj.checkMax(a, b, c);
    System.out.println(result + " is the max amongst the three!");
    sc.close();
  }
}
