package package01;

public class FormatSpecifier {
  public static void main(String[] args) {

    // left justification
    String name = "Alice";
    System.out.printf("NAME: %-10s | AGE: %d\n", name, 25);

    // right justification
    System.out.printf("NAME: %10s | AGE: %d\n", name, 25);

    // limit number of characters
    System.out.printf("Name: %.3s | Age: %d\n", name, 25);
    System.out.printf("Name: %10.3s | Age: %d\n", name, 25);

    // order of argument
    String name2 = "Bob";
    String name3 = "Brian";
    System.out.printf("Come here %3$s, %1$s and %2$s\n", name, name2, name3);

    // decimal to hexadecimal
    int n = 255;
    System.out.printf("For a decimal number value of %d the hexadecimal value is %x\n", n, n);

  }

}
