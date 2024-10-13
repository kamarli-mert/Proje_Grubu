import java.util.Scanner;   

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the annual income: ");
        double income = scanner.nextDouble();

        System.out.print("enter your marital status(1=single, 2=married, 3=head of household): ");
        int maritalStatus = scanner.nextInt();
        
        double tax = 0;
        if(income>=0){
            if (income<10_000){
                tax = 0;
            }else if (income<30_000) {
                tax = income/10;
            }else if (income<70_000) {
                tax = 2000+income/5;
            }else{
                tax = 3*income/10;
            }
        }else {
            System.out.println("You entered wrong income");
        }

        if ((maritalStatus == 1)||(maritalStatus == 2)||(maritalStatus == 3)){
            switch (maritalStatus){
                case 1:
                    System.out.println("Calculated tax= "+tax);
                    break;
                case 2:
                    System.out.println("Calculated tax= "+(tax-1000));
                    break;
                case 3:
                    System.out.println("Calculated tax= "+(tax-2000));
                    break;
            }
        }else{
            System.out.println("you entered wrong your marital status.");
        }






    }
}
