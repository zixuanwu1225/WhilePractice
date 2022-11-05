import java.util.Scanner;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        Test p = new Test();
        /*System.out.println(p.factorial(s.nextInt()));
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
            int number = 0;
            int max = -1318928;
            int min = 1318928;
            int check = 0;
            int askAgain = 0;
            while (check != -1) {
                check = number;
                number = s.nextInt();
                if (number == -1) {
                    System.out.println("Enter -1 again if you would liked to print out your numbers. Enter your next number if you would like to continue.");
                    askAgain = s.nextInt();
                    check = askAgain;
                    number = askAgain;
                    if (number > max) {
                        max = number;
                    }
                    if (number < min) {
                        min = number;
                    }
                }
                if (askAgain == -1) {
                    if ((max == -1318928) && (min == 1318928)) {
                        System.out.println("You did not input a value");
                    }
                    if ((max != -1318928) && (min != 1318928)) {
                        System.out.println("Your min value is: " + min);
                        System.out.println("Your max value is: " + max);
                    }
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }
        int x=0;
        int y=0;
        double z = 0;
        while (x!=-1){
            x=s.nextInt();
            if(x>0){
                y=y+x;
                z++;
            }
            if ((y==0)){
                System.out.println("You didn't input a value");
            }
        }
        System.out.println("Your sum is: "+y);
        System.out.println("The amount of numbers positive added is: "+z);
        System.out.println("Your average is: "+((double)y/z));*/
        StringLoops loops = new StringLoops();
        System.out.println(loops.countString("an", "Apples and bananas"));
        System.out.println(loops.countString("tat", "Ratatattat"));
        System.out.println(loops.countString("lower", "sunflower"));
        System.out.println(loops.countString("haha", "Hahahahaha"));
        System.out.println(loops.countString("HAHA", "Hahahahaha"));
        System.out.println(loops.countString("rain", "it’s the brain drain pain train"));
        System.out.println(loops.countString("was", "I was about to call you"));
        System.out.println(loops.countString("but", "I was about to call you"));
        System.out.println(loops.countString("i", "Supercalifragilisticexpialidocious"));


    }
}
