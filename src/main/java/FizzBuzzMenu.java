import java.util.Scanner;

// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class FizzBuzzMenu
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean running = true;
        int input;



        while (running) {

            // output menu options and input choice
            System.out.println("\n--------Fizzbuzz Menu--------\n1. Fizz\n2. Buzz\n3. Fizzbuzz\n4. Exit\nEnter your choice:  ");
            input = scan.nextInt();

            // switch case
            switch (input)
            {
                case 1:
                    // Fizz only
                    for (int i = 1; i <= 100; i++) {
                        if (i % 3 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    break;
                case 2:
                    // Buzz only
                    for (int i = 1; i <= 100; i++) {
                        if (i % 5 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    break;
                case 3:
                    // Fizz and Buzz
                    for (int i = 1; i <= 100; i++) {
                        if (i % 3 == 0 && i % 5 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    break;
                case 4:
                    // quit
                    System.out.println("Bye!");
                    running = false;
                    break;
            }
        }
    }
}