import java.util.Scanner;

public class getMax {
    static void getMaxNumber(int x, int y) {
        System.out.println("Max Number is: " + ((x < y) ? y : x));
    }

    static void getMaxNumber(int x, float y) {
        System.out.println("Max Number is: " + (((float) x < y) ? y : x));
    }

    static void getValues() {
        System.out.println("Enter your choice:");
        System.out.println("1 - compare two int numbers");
        System.out.println("2 - compare int and float");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Enter first int number:");
                Scanner sc1 = new Scanner(System.in);
                int firstInt = sc.nextInt();
                System.out.println("Enter second int number:");
                Scanner sc2 = new Scanner(System.in);
                int secondInt = sc.nextInt();
                getMaxNumber(firstInt, secondInt);
                break;
            }
            case 2: {
                System.out.println("Enter first int number:");
                Scanner sc1 = new Scanner(System.in);
                int firstInt = sc.nextInt();
                System.out.println("Enter second float number:");
                Scanner sc2 = new Scanner(System.in);
                float secondFloat = sc.nextFloat();
                getMaxNumber(firstInt, secondFloat);
                break;
            }
            case 3: {
                System.out.println("Invalid Input");
                break;
            }
        }
    }

    public static void main(String[] args) {
        getValues();
    }
}