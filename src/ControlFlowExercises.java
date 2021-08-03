import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;

        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }


        int counter = 0;

        do {
            System.out.println(counter);
            counter += 2;
        }while (counter <= 100);


        int counterBy5 = 100;

        do {
            System.out.println(counterBy5);
            counterBy5 -= 5;
        }while (counterBy5 >= -10);


        for (int dropBy5 = 100; dropBy5 >= -10; i -= 5) {
            System.out.println(dropBy5);
        }


        long bigCounter = 2L;

        do {
            System.out.println(bigCounter);
            bigCounter *= bigCounter;
        }while (bigCounter < 1000000L);


        for (long inte = 2L; inte < 1000000L; inte *= inte) {
            System.out.println(inte);
        }


        for (int integer = 1; i <= 100; i++) {
            if (integer % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(integer);
            }
        }


        Scanner scanner = new Scanner(System.in);

        boolean userContinue = true;

        do {
            System.out.println("What number");
            int userInt = scanner.nextInt();
            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int x = 1; x <= userInt; x++) {
                System.out.printf("%-6d", x);
                System.out.print(" | ");
                System.out.printf("%-7d", x * x);
                System.out.print(" | ");
                System.out.print(x * x * x);
                System.out.println();
            }
            System.out.println("Enter? (y/n)");
            String userResponse = scanner.next();
            if (!userResponse.equalsIgnoreCase("y")) {
                userContinue = false;
            }
        } while (userContinue);


        boolean anotherGrade = true;

        do {
            System.out.println("Enter grade 0 to 100");
            int userGrade = scanner.nextInt();
            if (userGrade >= 88) {
                System.out.println("A");
            } else if (userGrade >= 80) {
                System.out.println("B");
            } else if (userGrade >= 68) {
                System.out.println("C");
            } else if (userGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println("Enter new grade? (y/n)");
            String userResponse = scanner.next();

            if (!userResponse.equalsIgnoreCase("y")) {
                anotherGrade = false;
            }

        } while (anotherGrade);
    }
}
