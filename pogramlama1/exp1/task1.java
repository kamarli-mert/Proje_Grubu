import java.util.Scanner;

///write a code that validates a date. the program should determine if the
/// entered date is valid, considering month lengths and leap years

public class task1 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("enter the day month and year as integer");
        System.out.print("day: ");
        int day = scanner.nextInt();
        System.out.print("month: ");
        int month = scanner.nextInt();
        System.out.print("year: ");
        int year = scanner.nextInt();

        if (month>=1 && 12>month) {
            int maxDay = 31;
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                maxDay = 30; //Nisan, Haziran, Eylül, Kasım
            } else if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
            }
            if (day < 1 || day > maxDay) {
                System.out.println("Invalid date: Day in this month must be between 1 and " + maxDay);
            }else {
                System.out.println("You entered valid date");
            }

        }
        else {
            System.out.println("You entered the wrong month number");
        }
    }
}
