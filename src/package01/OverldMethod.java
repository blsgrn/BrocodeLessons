package package01;

public class OverldMethod {
  public static void main(String[] args) {

    // overloaded method is a method that shares the same name but with diferent
    // parameters
    System.out.println(add(2, 3));
    System.out.println(2.34567D + 5.48456D);
    System.out.println(add(2, 3, 3));
    System.out.println(add(2, 3, 3, 8));

  }

  static int add(int a, int b) {
    System.out.println("this is method #1");
    return a + b;
  }

  // overloaded method with additional parameter
  static int add(int a, int b, int c) {
    System.out.println("this is method #2");
    return a + b - c;
  }

  // overlaoded method with additional parameter
  static int add(int a, int b, int c, int d) {
    System.out.println("this is method #3");
    return a + b + c + d;
  }

  // overloaded method with different type

  static double add(double a, double b) {
    System.out.println("this is method #4");
    return a + b;
  }
}
