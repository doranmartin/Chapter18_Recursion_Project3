import java.util.Scanner;

public class Exercise18_11 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        long userInput = scanner.nextLong();
        System.out.printf("The sum of digits in %d is %d\n",
                userInput, sumDigits(userInput));
    }

    // Sum digits recursive method
    public static int sumDigits(long n) {
        return sumDigits(n, 0);
    }

    // Sum digits tail recursive helper method
    private static int sumDigits(long n, long sum) {
        if (n == 0) {
            return (int)sum;
        }
        return sumDigits(n / 10, sum + n % 10);
    }

}
