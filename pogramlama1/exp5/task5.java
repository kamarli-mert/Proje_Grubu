import java.util.Scanner;
///RGB işi
public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter tree integers representing the RGB values (0-255)");
        System.out.print("R(0-255): ");
        int r = scanner.nextInt();
        System.out.print("G(0-255): ");
        int g = scanner.nextInt();
        System.out.print("B(0-255): ");
        int b = scanner.nextInt();

        if((r>255 || r<0)||(g>255 || g<0)||(b>255 || b<0)){
            System.out.println("Please enter valid RGB values (0-255).");
            }
        else{
            if (r == g && g == b) {
                System.out.println("Colors are equal in intensity.");
            }else if ((r==b && r>g)||(r==g && r>b)||(b==g && b>r)){
                System.out.println("No dominant color, two or more colors are equal and highest.");
            }else if (r > g && r > b) {
                System.out.println("Dominant color: Red");
            } else if (g > r && g > b) {
                System.out.println("Dominant color: Green");
            } else{
                System.out.println("Dominant color: Blue");
            }
        }
    }
}