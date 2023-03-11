package override;

public class Dog extends Animal {
  // method overriding - declaring a method in subclass which is already present
  // in parent class. Done so that the child class can give its own
  // implementation.

  @Override // good practise
  void makeNoise() {
    System.out.println("The dog barks!!");
  }

}
