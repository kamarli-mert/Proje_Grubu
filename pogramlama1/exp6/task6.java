import java.util.Scanner;
///piecewise (parçalı) function

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a real number to put it in function");
        System.out.print("x= ");
        double x = scanner.nextDouble();

        if (x<=0){
            System.out.println("f("+x+") = "+ Math.pow(x,2));
        } else if (x<10) {
            System.out.println("f("+x+") = "+ (2*x+1));
        } else if (x>=10) {
            System.out.println("f("+x+") = "+ (Math.pow(x,3)+x));
        }
    }
}
