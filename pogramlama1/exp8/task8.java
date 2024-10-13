import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] notes = {"A", "B", "C", "D", "F" };


        System.out.print("Please enter exam score: ");
        int exam = scanner.nextInt();
        System.out.print("Please enter attendance percentage:(%) ");
        double perAttend = scanner.nextDouble();
        System.out.print("Please enter participation level (1=Low, 2=Medium, 3=High): ");
        int partLvl = scanner.nextInt();

        String examScore;

        if (exam < 100 && exam > 90) {
            examScore = notes[0];//A
        } else if (exam > 80) {
            examScore = notes[1];//B
        } else if (exam > 70) {
            examScore = notes[2];//C
        } else if (exam > 60) {
            examScore = notes[3];//D
        } else {
            examScore = notes[4];//F
        }

        if (perAttend < 75) {
            switch (examScore) {
                case "A":
                    examScore = notes[1]; // A -> B
                    break;
                case "B":
                    examScore = notes[2]; // B -> C
                    break;
                case "C":
                    examScore = notes[3]; // C -> D
                    break;
                case "D":
                    examScore = notes[4]; // D -> F
                    break;
            }
        }

        switch (partLvl) {
            case 3:
                switch (examScore) {
                    case "B":
                        examScore = notes[0]; // B -> A
                        break;
                    case "C":
                        examScore = notes[1]; // C -> B
                        break;
                    case "D":
                        examScore = notes[2]; // D -> C
                        break;
                    case "F":
                        examScore = notes[3]; // F -> D
                        break;
                }
                break;

            case 1:
                switch (examScore) {
                    case "A":
                        examScore = notes[1]; // A -> B
                        break;
                    case "B":
                        examScore = notes[2]; // B -> C
                        break;
                    case "C":
                        examScore = notes[3]; // C -> D
                        break;
                    case "D":
                        examScore = notes[4]; // D -> F
                        break;
                }
                break;
        }

        System.out.println("Exam Score: " + examScore);
    }
}

