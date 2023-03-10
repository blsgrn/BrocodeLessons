package inherit;

public class Main {
  public static void main(String[] args) {
    Car car01 = new Car();
    Bicycle bike01 = new Bicycle();

    car01.go();
    bike01.stop();

    System.out.println(car01.speed);
    System.out.println(car01.wheels);
    System.out.println(bike01.speed);
    System.out.println(bike01.wheels);
  }

}
