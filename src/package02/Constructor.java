package package02;

public class Constructor {
  public static void main(String[] args) {
    // Constructor - a special method that is called when an object is instantiated
    // (created). The constructor is Human()

    Human man001 = new Human("Hishinoi", 34, 82.3);
    Human man002 = new Human("James", 23, 76.5);

    System.out.println(man001.name);
    System.out.println(man002.weight);

    man001.sleep();
    man002.eat();
  }

}
