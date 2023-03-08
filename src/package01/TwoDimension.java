package package01;

import java.util.*;

public class TwoDimension {
  public static void main(String[] args) {

    // create 2D ArrayList
    ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

    ArrayList<String> bakeryList = new ArrayList<String>();
    bakeryList.add("pasta");
    bakeryList.add("garlic bread");
    bakeryList.add("donuts");

    ArrayList<String> drinkList = new ArrayList<String>();
    drinkList.add("soda");
    drinkList.add("coffee");

    ArrayList<String> produceList = new ArrayList<String>();
    produceList.add("tomatoes");
    produceList.add("potatoes");
    produceList.add("carrots");

    // adding the arrays within the 2D ArrayList
    groceryList.add(produceList);
    groceryList.add(bakeryList);
    groceryList.add(drinkList);

    System.out.println(groceryList);
    System.out.println(groceryList.get(0));// output is produce list
    System.out.println(groceryList.get(1).get(2));// output is donuts
  }
}
