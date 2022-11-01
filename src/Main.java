import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        triangle.a = input.nextInt();
        triangle.b = input.nextInt();
        triangle.c = input.nextInt();

        triangle.area();

    }
}