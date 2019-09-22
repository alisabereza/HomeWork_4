import java.util.Scanner;

public class drawRectangle {
    static void draw(int height, int width) {

        if (height < 1 || width < 1) {
            System.out.println("Invalid Value. Both height and width must be >0");
        } else {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print("+");
                }
                System.out.println();
            }
        }
    }

    static void draw(int width) {
        draw(width, width);
    }

    static void startDrawing(int choice) {
        switch (choice) {
            case 1: {
                System.out.println("Enter width:");
                Scanner sc1 = new Scanner(System.in);
                int width = sc1.nextInt();
                System.out.println("Enter height:");
                Scanner sc2 = new Scanner(System.in);
                int height = sc2.nextInt();
                draw(height, width);
                break;
            }
            case 2: {
                System.out.println("Enter side length:");
                Scanner sc1 = new Scanner(System.in);
                int side = sc1.nextInt();
                draw(side);
                break;
            }
            default: {
                System.out.println("Invalid Input");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Select:");
        System.out.println("1 - to draw rectangle");
        System.out.println("2 - to draw square");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        startDrawing(choice);
    }
}
