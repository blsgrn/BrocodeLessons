package superkeyword;

public class Person {
  String name;
  int age;
  // creating a constructor with attributes that can be used by child class
  // constructor

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return this.name + "\n" + this.age + "\n";
  }
}
