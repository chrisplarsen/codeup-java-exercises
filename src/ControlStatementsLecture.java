import java.util.Scanner;

public class ControlStatementsLecture {

    public static void main(String[] args) {

        String myName = "Christian";
        int age = 27;

        String someoneElsesName = "Ann";

        System.out.println(myName.equals(someoneElsesName));


        boolean isUserNamedChristianAndIs27 = (myName.equals("Christian") && age >= 27);

        System.out.println("user met requirements is a " + isUserNamedChristianAndIs27 + " statement.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Continue?");
        boolean usersResponse = scanner.next().equals("y");

        System.out.println(usersResponse);

        if (usersResponse) {
            System.out.println("Will continue");
        } else {
            System.out.println("Will not");
        }
    }

}
