import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        Test p = new Test();
        System.out.println(p.factorial(s.nextInt()));
        p.printThis(s.nextInt());
        System.out.println(p.isPrime(2));
        System.out.println(p.isPrime(13));
        System.out.println(p.isPrime(14));
        System.out.println(p.isPrime(30));
        System.out.println(p.isPrime(1));
        System.out.println(p.isPrime(51));
        System.out.println(p.isPrime(121));
        System.out.println(p.isPrime(227));
        System.out.println(p.maxDoubles(4, 20));
        System.out.println(p.maxDoubles(2, 65));
        System.out.println(p.maxDoubles(5, 500));
        System.out.println(p.maxDoubles(2, 64));
        System.out.println(p.maxDoubles(2, 63));
        System.out.println(p.maxDoubles(8, 10));
        System.out.println(p.maxDoubles(8, 5));
    }
}