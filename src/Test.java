public class Test {
    public Test(){}
    public double factorial(int number){
        double factor = number;
        double product = 1;
        while (factor != 1){
            product = product*(factor-1);
            factor = factor-1;
        }
        return product*number;
    }
    public void printThis(int number)
    {
        while (number!= 0)
        {
            int x = 1;
            int number1 = number%(x*10);
            int number2 = 0;
            number2 = number1;
            System.out.println(number2);
            x = x*10;
            number = (number-number1)/x;
        }
    }
    public boolean isPrime(int number){
        int x = 1;
        while (number != x){
            x++;
            if ((number/x == 1)||(number==2)){
                return true;
            }
            else if ((number%2 == 0)||(number%x == 0)){
                return false;
            }
        }
        return false;
    }
    public int maxDoubles(int number, int threshold)
    {
        int count;
        for (count = 0;number<=threshold;count =count+1){
            number = number * 2;
            if (number>threshold) {
                return count;
            }
        }
        return count;
    }
}
