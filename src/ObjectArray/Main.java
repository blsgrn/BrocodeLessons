package ObjectArray;

public class Main {
  public static void main(String[] args) {
    // Food[] refigerator = new Food[3];

    Food food1 = new Food("Pizza");
    Food food2 = new Food("Bread");
    Food food3 = new Food("Apple Pie");

    // refigerator[0] = food1;
    // refigerator[1] = food2;
    // refigerator[2] = food3;

    Food[] refigerator = { food1, food2, food3 };

    System.out.println(refigerator[2].name);
  }
}
