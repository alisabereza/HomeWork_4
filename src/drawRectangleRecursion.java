import java.util.Scanner;

public class drawRectangleRecursion {
    static int drawW(int width) {
        if (width <= 1) {
            System.out.print("+");
            return 1;
        }
        drawW(width - 1);
        System.out.print("+");
        return width;
    }

    static int drawH(int width, int height) {
        if (height <= 1) {
            drawW(width);
            return 1;
        }
        drawH(width, height - 1);
        System.out.println();
        drawW(width);
        return height;
    }

    static void startDrawing() {
        System.out.println("Enter width:");
        Scanner sc1 = new Scanner(System.in);
        int width = sc1.nextInt();
        System.out.println("Enter height:");
        Scanner sc2 = new Scanner(System.in);
        int height = sc2.nextInt();
        drawH(width, height);
        System.out.println();
    }

    public static void main(String[] args) {
        startDrawing();
    }
}
