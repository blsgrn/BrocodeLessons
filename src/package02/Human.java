package package02;

public class Human {
  String name;
  int age;
  double weight;

  // this is the constructor
  Human(String name, int age, double weight) {
    this.name = name; // this refers the object instantiated
    this.age = age;
    this.weight = weight;
  }

  // Human constructor has these methods
  void eat() {
    System.out.println(this.name + " is eating!");
  }

  void sleep() {
    System.out.println(this.name + " is sleeping");
  }
}
