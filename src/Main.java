import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("To get a triangle you need to enter a number (from 1 to 5)");
        System.out.println("User inputs:");
        check();
        int rows = scanner.nextInt();
        if (rows > 0 && rows <= 5) {
            System.out.println("Correctly entered number.  " + rows);
            for (int i = 1; i <= rows; ++i) {
                for (int j = 1; j <= i; ++j) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {

            System.out.println("I don't understand you, enter a number from 1 to 5. Not this - " + rows);

            rows = scanner.reset().nextInt();
            System.out.println("Let's try again");

            for (int i = 1; i <= rows; ++i) {
                for (int j = 1; j <= i; ++j) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


    }
    public static void check(){
        while (!scanner.hasNextInt() && scanner.hasNext()) {
            System.out.println("Wrong. I said the number. Not letters. Where did you look? " + scanner.next());
        }
    }

}

