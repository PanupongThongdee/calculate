package project;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i * 2);

        Test test = new Test();
        test.example();
    }
}

class Test {
  public void example() {
    System.out.println("This is a test class.");
  }
}