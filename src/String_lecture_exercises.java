import java.util.Scanner;

public class String_lecture_exercises {
    public static void main(String[] args) {
        String message = "hello";
        System.out.println(message);
        message = message + " world!";
        System.out.println(message);

        //

        Scanner sc = new Scanner (System.in);
        System.out.print("Contine? (y/n)");
        String userInput = sc.next();

        boolean correctConfirmation = userInput.equals("y");
        System.out.println(correctConfirmation);

        //


    }
}
