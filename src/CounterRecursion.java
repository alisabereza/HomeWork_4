import java.util.Scanner;

public class CounterRecursion {
    static int printNumbers(int n) {

        if (n <= 1) {
            System.out.println(n);
            return 1;
        }
        int i = printNumbers(n - 1);
        System.out.println(n);
        return n;
    }

    static void getValue() {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid Value");
        } else {
            printNumbers(n);
        }
    }

    public static void main(String[] args) {
        getValue();
    }
}
