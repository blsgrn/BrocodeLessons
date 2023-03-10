package car;

public class Main {
  public static void main(String[] args) {
    // toString() is a special method that all objects inherit
    // it returns a string that textually represents an object
    // can be used both implicitly and explicitly
    Car car01 = new Car();

    System.out.println(car01);// implicit

    System.out.println("\n");
    // explicitly will also give same result
    System.out.println(car01.toString());
  }
}
