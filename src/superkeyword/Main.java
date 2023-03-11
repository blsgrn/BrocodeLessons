package superkeyword;

public class Main {

  public static void main(String[] args) {

    Hero hero1 = new Hero("batman", 46, "nightvision");
    Hero hero2 = new Hero("superman", 48, "climb buildings");

    System.out.println(hero1.name);
    System.out.println(hero1.age);
    System.out.println(hero1.power);

    System.out.println("----------------------");

    Person ordinaryPerson1 = new Person("Joe", 34);
    System.out.println(ordinaryPerson1.name);
    System.out.println(ordinaryPerson1.age);

    System.out.println("-----------------------");

    System.out.println(hero2);
  }
}
