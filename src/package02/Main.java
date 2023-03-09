package package02;

public class Main {
  public static void main(String[] args) {
    Car myCar = new Car();
    Car sisCar = new Car();

    System.out.println(myCar.color);
    System.out.println(myCar.make);
    System.out.println(myCar.model);

    myCar.drive();
    myCar.brake();

    System.out.println(sisCar.color);
    sisCar.brake();

  }
}
