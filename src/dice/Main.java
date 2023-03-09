package dice;

public class Main {
  public static void main(String[] args) {
    // local - declared inside a method. only visible to that method
    // declared outside a method but within a class visible to all parts of a class
    DiceRoller diceRoller = new DiceRoller();

    diceRoller.roll();

  }
}
