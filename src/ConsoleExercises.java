import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;

        System.out.format("The value of pi is approximately %.2f", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Int");
        int userInt = scanner.nextInt();
        System.out.println(userInt);
        //putting nextLine instead of next will let you input multiple words


        System.out.println("Enter 3 words");
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        String thirdWord = scanner.nextLine();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);


        System.out.println("Enter a sentence");

        String userSentence = scanner.nextLine();

        System.out.println(userSentence);


        System.out.println("Length and width");
        System.out.println("Give us a width: ");

        double width = Double.parseDouble(scanner.nextLine());

        System.out.println("Give length: ");

        double length = Double.parseDouble(scanner.nextLine());

        double area = length * width;
        double perimeter = (width * 2) + (length * 2);

        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);



    }

}

