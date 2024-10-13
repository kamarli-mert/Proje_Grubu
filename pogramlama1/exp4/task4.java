import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a four-digit integer: ");
        String number = scanner.next();

        if (number.length() != 4) {
            System.out.println("you entered wrong");
        } else {
            int intNum = Integer.parseInt(number);

            int a = intNum % 10;
            int b = (intNum / 10) % 10;
            int c = (intNum / 100) % 10;
            int d = intNum / 1000;

            int sum = a + b + c + d;
            System.out.println("sum= "+sum);
            int product = a * b * c * d;
            System.out.println("product= "+product);

            if (sum > product) {
                System.out.println("Sum is greater than the product");
            } else if (sum == product) {
                System.out.println("Sum and product are equal");
            } else {
                System.out.println("Product is greater than the sum");
            }
        }
    }
}
