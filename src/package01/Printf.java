package package01;

public class Printf {
  public static void main(String[] args) {
    /*
     * printf is an optional method to control, format and display TEXT to console
     */

    // format specifier is %. conversion character is d - decimal
    System.out.printf("Today weather is %d Celcius.\n", 34);

    // b - boolean
    boolean haveMoney = false;
    System.out.printf("Do I have any money today? %b. \n", haveMoney);

    // c - char
    char sex = 'M';
    System.out.printf("%c is short for male.\n", sex);

    // s - String
    String welcomeMessage = "Good Morning!, ";
    System.out.printf("%sI am your insurance manager.\n", welcomeMessage);

    // f - float and double
    double radius = 34.3345433;
    System.out.printf("The radius of the pond is %f meter. \n", radius);

    // widthfiel - limit the digits after decimal. default is 6
    System.out.printf("The radius of the pond is %.3f meter. \n", radius);
    System.out.printf("The radius of the pond is %.7f meter. \n", radius);

    // width field - minus (-) for space after
    System.out.printf("%.4s, I am your manager.\n", welcomeMessage);
  }
}
