import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur grade");

        int number = sc.nextInt();

        if (number <= 49) {
            System.out.println("grade F \n" + number);
        }
        else if (number > 49 && number < 50) {
            System.out.println("grade D \n" + number);
        }
        else if (number >= 50 && number < 59) {
            System.out.println("grade D+ \n" + number);
        }
        else if (number >= 60 && number < 64) {
            System.out.println("grade C \n" + number);
        }
        else if (number >= 65 && number < 69) {
            System.out.println("grade C+ \n" + number);
        }
        else if (number >= 70 && number < 74) {
            System.out.println("grade B \n" + number);
        }
        else if (number >= 75 && number < 79) {
            System.out.println("grade B+ \n" + number);
        }
        else if (number >= 80) {
            System.out.println("grade A \n" + number);
          }
    }
}