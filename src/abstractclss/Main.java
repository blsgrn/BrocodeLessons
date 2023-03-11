package abstractclss;

public class Main {
  public static void main(String[] args) {
    // an abstract class cannot be substantiated but it can have subclass. it is to
    // prevent an instance being created using the super class.

    Car car = new Car();
    // Vehicle vehicle = new Vehicle();
    car.go();
  }
}
