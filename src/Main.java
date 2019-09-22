import java.util.Scanner;

public class Main {
    static void startMenu() {
        System.out.println("Select the task:");
        System.out.println("1. Count from 1 to Number");
        System.out.println("2. Draw Rectangle");
        System.out.println("3. Draw Square");
        System.out.println("4. Get Max Value");
        System.out.println("5. Count from 1 to Number using Recursion");
        System.out.println("6. Draw Rectangle using Recursion");
        System.out.println("Enter your choice:");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1: {
                Counter.countTo();
                break;
            }
            case 2: {
                drawRectangle.startDrawing(1);
                break;
            }
            case 3: {
                drawRectangle.startDrawing(2);
                break;
            }
            case 4: {
                getMax.getValues();
                break;
            }
            case 5: {
                CounterRecursion.getValue();
                break;
            }
            case 6: {
                drawRectangleRecursion.startDrawing();
                break;
            }
            default: {
                System.out.println("Invalid Value. Re-run and select the task from 1 to 6.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        startMenu();
        boolean continueTask = true;
        while (continueTask) {

            System.out.println("Do you want to continue? (1-Yes, 2-No)");
            Scanner scanner = new Scanner(System.in);
            int solution = scanner.nextInt();
            switch (solution) {
                case 1: {
                    startMenu();
                    break;
                }
                case 2: {
                    continueTask = false;
                    break;
                }
                default: {
                    System.out.println("Invalid Input");
                }
            }
        }
    }
}
