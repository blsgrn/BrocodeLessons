package staticusage;

public class Friend {
  String name;
  static int numberOfFriends;
  String codeWord = "Howdy!";

  Friend(String name) {
    this.name = name;
    numberOfFriends++;
  }

  static void displayFriends() {
    System.out.println("You have " + numberOfFriends + " friends!");
  }
}
