
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int power;
        System.out.println("Enter a number to determine whether or not the number is an armstrong number.");
        if(in.hasNextInt()) {
            String number = in.next();
            int userInput = Integer.parseInt(number);
            int[] numbers = new int[number.length()];

            for(int i = 0; i < number.length(); i++) {
                numbers[i] = Integer.parseInt(number.charAt(i) + "");
            }

            int cur = 0;
            int cumSum = 0;
            int sol;

            for(int i = 0; i < numbers.length; i++) {
                sol = (int) Math.pow(numbers[i], numbers.length);
                cur += sol;
                // 3**3 + 7**3 + 1**3 = 371
                // 9^4 + 7^4 + 9^4 + 4^4 = 9474
            }
            if(cur == userInput ){
                System.out.println("This number is an armstrong number.");
                System.out.println(userInput + " = "  + cur);
            } else {
                System.out.println("This number is not an armstrong number.");
                System.out.println(userInput + " != "  + cur);
            }
        } else {
            System.err.println("The entered value is not valid");
        }
    }
}