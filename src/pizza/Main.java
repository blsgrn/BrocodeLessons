package pizza;

public class Main {
  public static void main(String[] args) {
    Pizza pizza = new Pizza("thicc crust", "tomato", "mozzerella", "pepperoni");

    System.out.println("Here are the ingredients of pizza:");
    System.out.println(pizza.bread);
    System.out.println(pizza.cheese);
    System.out.println(pizza.sauce);
    System.out.println(pizza.topping);

    Pizza pizzaWithoutTopping = new Pizza("thicc crust", "mayonase", "mozzerella");

    System.out.println("Here are the ingredients of pizza without topping:");
    System.out.println(pizzaWithoutTopping.bread);
    System.out.println(pizzaWithoutTopping.sauce);
    System.out.println(pizzaWithoutTopping.cheese);

  }
}
