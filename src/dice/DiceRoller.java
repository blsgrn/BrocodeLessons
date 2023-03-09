package dice;

import java.util.Random;

public class DiceRoller {
  // global variable
  Random p;
  int n = 0;

  // create constructor
  DiceRoller() {
    p = new Random();
    n = 0;
    roll();
  }

  // create a method
  void roll() {
    n = p.nextInt(6) + 1;
    System.out.println(n);
  }

}
