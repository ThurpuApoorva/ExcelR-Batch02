import java.util.Scanner;

class Class1 {
    static int a, b, c;

    public void add() {
        c = a + b;
        System.out.println("Sum is: " + c);
    }

    public void sub() {
        c = a - b;
        System.out.println("Difference is: " + c);
    }
}

public class Demo054 {
    public static void main(String[] args) {
        Class1 obj = new Class1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        obj.a = sc.nextInt();
        System.out.print("Enter second number: ");
        obj.b = sc.nextInt();

        obj.add();
        obj.sub();
    }
}
