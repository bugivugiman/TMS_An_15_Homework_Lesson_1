import java.util.Scanner;

public class Lesson1_add {
    public static void main(String[] args) {
        Scanner in_name = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = in_name.nextLine();
        System.out.println("Hello " + name);
    }

}
