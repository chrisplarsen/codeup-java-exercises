import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.print("Hello ");
        System.out.print("world!");

        //int newNumber = 5;
        //or
        //int newNumber;
        //newNumber = 5;

        byte dayOfMonth = 31;

        short numberOfEmployees = 129;

        int carPrice = 50000;

        long diameterOfMilkyWay = 7574875807879L;

        float gradeAverage = 93.35f;

        double testDouble = 10909090909.384989389;

        char yesNo = 'Y';

        boolean trueOrFalse = true;

        String name = "Christian Larsen";

        String criminalMinds = "\"Some cheesy quote\" \n -Mark Twain";

        String rockNRoll = "\t\\m/";

        System.out.println(criminalMinds);

        System.out.println(rockNRoll);

        final int SIDES_OF_A_DICE = 6;
        final String API_KEY = "b75b703d8195f6f433ca";
        final String GITHUB_API_BASE_URL = "https://api.github.com";

        int sum = 5 + 6;

        int difference = 5 - 6;

        int multiply = 5 * 6;

        double division = 5 / 6f;

        int someNumber = 5;

        System.out.println(++someNumber);

        //implicit casting; less to more precise; like a matchbox into a shoebox
        int myNewInt = 908;
        long morePrecise = myNewInt;

        //explicit casting, more precise to less precise
        double pi = 3.14159;
        int almostPi = (int) pi;

        int myFavoriteNumber = 27;

        String myString = "yee yee mofo";

//        myString = 'yee yee mofo';
//
//        myString = 3.14159;

        //long myNumber;
        //myNumber = 3.14;
//        myNumber = 123L;
//        myNumber = 123;

        //float myNumber = 3.14;
        //System.out.println(myNumber);

        String greeting = "salutations";
        String names = "codeup";
        System.out.printf("%s, %s!", greeting, names);

        int intVar = 6;
        float floatVar = 49.8f;
        String stringVar = "This is a string";
        System.out.format("The value of " + "the float variable is " +
                "%f, while the value of the " + "integer variable is %d, " +
                "and the string is %s", floatVar, intVar, stringVar);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();
        //putting nextLine instead of next will let you input multiple words

        System.out.println("You entered: --> \"" + userInput + "\" <--");

    }

}