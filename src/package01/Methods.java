package package01;

public class Methods {
  public static void main(String[] args) {
    String familyMember01 = "Shamini";
    hello("Subramainian");// invoking the hello method
    hello(familyMember01);

    int x = 23;
    int y = 28;
    int z = add(x, y);
    System.out.println(z);
  }

  // creating hello method (void type)
  static void hello(String name) {
    System.out.println("hello " + name + "!!");
  }

  // creating return type method
  static int add(int numb1, int numb2) {
    int total = numb1 + numb2;
    return total;
  }
}
