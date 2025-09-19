import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Your name is: " + name);
        }
    }
}