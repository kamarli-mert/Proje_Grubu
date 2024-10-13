import java.util.Scanner;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("please enter a tree-digit integer: ");
        String input = scanner.nextLine();

        if (input.length() != 3){
            System.out.println("you entered wrong integer");
        }else {
            int sayi = Integer.parseInt(input);

            int ones = sayi%10;
            int tens = (sayi/10)%10;
            int hundreds = sayi/100;

            int[] digits = {hundreds, tens, ones};
            Arrays.sort(digits);

            System.out.print("Digits sorted from smallest to largest: ");
            for (int i=0; i<input.length(); i++){
                System.out.print(digits[i]+" ");
            }

            System.out.print("\nDigits sorted from largest to smallest: ");
            for (int i=input.length()-1; i>=0; i--){
                System.out.print(digits[i]+" ");
            }



        }

    }
}































