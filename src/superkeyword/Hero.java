package superkeyword;

public class Hero extends Person {
  String power;

  // creating a constructing using attributes with Parent class
  Hero(String name, int age, String power) {
    super(name, age); // this refers to object instantiate while super refers to parent of the object
                      // instantiated.
    this.power = power;

  }

  public String toString() {
    return super.toString() + this.power;
  }
}
