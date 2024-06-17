
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean cont = true;
        while (cont) {
            System.out.println("Enter a number to determine whether or not the number is an armstrong number.");
            if (in.hasNextInt()) {
                String number = in.next();
                int userInput = Integer.parseInt(number);
                int[] numbers = new int[number.length()];

                for (int i = 0; i < number.length(); i++) {
                    numbers[i] = Integer.parseInt(number.charAt(i) + "");
                }

                int cur = 0;
                int sol;

                for (int j : numbers) {
                    sol = (int) Math.pow(j, numbers.length);
                    cur += sol;
                    // 3**3 + 7**3 + 1**3 = 371
                    // 9^4 + 7^4 + 9^4 + 4^4 = 9474
                }

                if (cur == userInput) {
                    System.out.println("This number is an armstrong number.");
                    System.out.println(userInput + " = " + cur);
                    System.out.println("Would you like to check another number? y/n");
                    cont = tryAgain(in);
                } else {
                    System.out.println("This number is not an armstrong number.");
                    System.out.println(userInput + " != " + cur);
                    System.out.println("Would you like to check another number? y/n");
                    cont = tryAgain(in);
                }
            } else {
                System.err.println("The entered value is not valid");
                System.out.println("Would you like to try again? y/n");
                cont = tryAgain(in);
            }
        }
    }
    public static boolean tryAgain(Scanner in){
        String tryAgain = in.next();
        if (!tryAgain.equalsIgnoreCase("y")) {
            System.out.println("Thank you for using the program.");
            return false;
        }
        return true;
    }
}