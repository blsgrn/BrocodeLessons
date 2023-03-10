package staticusage;

public class Main {
  public static void main(String[] args) {
    Friend friend1 = new Friend("SpongeBob");
    Friend friend2 = new Friend("Patrick");
    Friend friend3 = new Friend("Squidward");

    friend1.codeWord = "jambo!";

    System.out.println(friend1.name);
    System.out.println(friend2.name);
    System.out.println(friend3.name);
    System.out.println(Friend.numberOfFriends);
    System.out.println(friend1.codeWord);
    System.out.println(friend2.codeWord);

    Friend.displayFriends();
  }

}
