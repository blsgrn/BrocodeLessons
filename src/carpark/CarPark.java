package carpark;
//to get a method on car objects created using Car() constructor

public class CarPark {

  // not a constructor, but a method, therefore no need to give same name as class
  void park(Car car) {

    System.out.println(car.name + " is parked!");

  }
}
