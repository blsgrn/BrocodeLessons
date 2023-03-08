package package01;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // ArrayList - a resizable array
        // elements can be added or removed after compilation phase
        // store reference data types
        // instead of .length, .size gives the number of elements within array
        // use .get method to get the element by index

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(1, "salad"); // replace an element
        food.remove(2); // remove an element
        food.clear(); // remove all elements

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
