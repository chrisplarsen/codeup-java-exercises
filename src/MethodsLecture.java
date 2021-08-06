import java.util.Scanner;

public class MethodsLecture {

    static double piValue = 3.14;

    public static String sayHello(String usersName) {
        String helloMessage = String.format("Hello, %s!", usersName);
        return helloMessage;
    }

    public static double getAreaOfCircle(long radius) {
        return piValue * (radius * radius);
    }

    public static double getAreaOfCircle(double radius) {
        return piValue * (radius * radius);
    }

    public static boolean doesUserWantToContinue() {
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to continue?");

        String usersResponse = input.nextLine();

        if (usersResponse.equals("yes")) {
            return true;
        } else if (usersResponse.equals("no")) {
            return false;
        } else {
            doesUserWantToContinue();
        }
        return false;
    }

    public static void main(String[] args) {

        doesUserWantToContinue();

        System.out.println(sayHello("Allison"));

        int radiusOfCircle = 4;

        System.out.println(getAreaOfCircle(radiusOfCircle));

    }
}
