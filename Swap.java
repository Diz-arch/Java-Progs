public class Swap {
  void swap(int a, int b){
    System.out.println("Before swap\na = " + a + "\nb = " + b );
    int temp;
    temp = a;
    a = b;
    b = temp;
    System.out.println("After swap\na = " + a + "\nb = " + b );
  }
  public static void main(String[] args){
    Swap sp = new Swap();
    int a, b;
    a = 10;
    b = 5;
    sp.swap(a, b);
  }
}
