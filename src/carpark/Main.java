package carpark;

public class Main {

  public static void main(String[] args) {
    Car car01 = new Car("Cheverot");
    Car car02 = new Car("Lenova");

    System.out.println(car01.name);
    System.out.println(car02.name);

    CarPark parking = new CarPark();
    parking.park(car01);
    parking.park(car02);

  }

}
