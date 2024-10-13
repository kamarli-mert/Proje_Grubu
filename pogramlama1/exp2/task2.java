import java.util.Scanner;

/// 5 haneli palindrome sayısı kontrolü

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a five-digit integer: ");
        String input = scanner.nextLine();  //.length() kullanmak için string aldım

        if (input.length()<5) {
            System.out.println("Invalid input. Please enter a valid five-digit number.");
        }else {
            boolean isPalindrome = true;

            int length = input.length();
            for (int i = 0; i < length / 2; i++) {
                if (input.charAt(i) != input.charAt(length- i- 1)) {
                    isPalindrome = false;
                    break; //1 tane farklı olması yeter sonuna kadar yapmaya gerek yok
                }
            }
            if (isPalindrome) {
                System.out.println("The number is a palindrome.");
            } else {
                System.out.println("The number is not a palindrome.");
            }
        }
    }
}
