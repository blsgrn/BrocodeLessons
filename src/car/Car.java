package car;

public class Car {
  String make = "Ford";
  String model = "Mustang";
  String color = "red";
  int year = 2023;

  // toString() method overwriting

  public String toString() {
    // String objectTextForm = make + "\n" + model + "\n" + color + "\n" + year;
    // return objectTextForm;

    return make + "\n" + model + "\n" + color + "\n" + year;
  }
}