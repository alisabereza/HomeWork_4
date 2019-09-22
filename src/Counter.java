import java.util.Scanner;

public class Counter {
    static void countTo() {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        countTo();
    }
}
