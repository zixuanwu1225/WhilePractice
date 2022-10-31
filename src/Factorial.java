import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        Test p = new Test();
        System.out.println(p.factorial(s.nextInt()));
        p.printThis(d.nextInt());
    }
}
