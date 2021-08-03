import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Say something to Bob.");
        String userResponse = scanner.nextLine().trim();

        if (userResponse.endsWith("?")) {
            System.out.println("Sure.");
        } else if (userResponse.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userResponse.isEmpty()) {
            System.out.println("Fine, be that way.");
        } else {
            System.out.println("Whatever.");
        }


    }
}
