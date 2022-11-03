import java.util.*;

class JavaFunctions {

    //This function print character pattern
    public static void printCharPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many rows will be print: ");
        int n = sc.nextInt();
        char ch = 'A';
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    //Print reverse order of any number
    public static long reverseNum(long n) {
        long reverseNum = 0;
        while(n != 0) {
            int lastDigit = (int) n % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            n /= 10;
        }
        return reverseNum;
    }

    //check a number is prime or not?
    public static boolean isPrime(int n){
        if(n==0 || n==1) {
            return false;
        }        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    //print all prime number between 2 to n
    public static void printPrimeNRange(int n) {
        for(int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    //swap value of two variables
    public static void swap(int x, int y) {
        System.out.println("The value was in x " + x + " & The value was in y " + y);
        int temp = 0;
        temp = x;
        x = y;
        y = temp;
        System.out.println("Now The value in x is " + x + " & The value was in y " + y);
    }

    //Return Factorial of n
    public static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    //Return Binomial coffeciant
    public static int binomialCoff (int n, int r) {
        int binoCoff;
        binoCoff = factorial(n) / (factorial(r) * factorial(n-r));
        return binoCoff;
    }

    //check given input is binary or not?
    public static boolean isbinary(int n) {
        if(n == 0 || n == 1) {
            return true;
        }
        while(n != 0) {
            if(n % 10 > 1) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }

    //Binary to Decimal Conversion
    public static int binToDec(int n) {
        int pow =0;
        int dec = 0;
        if (isbinary(n)) {
            while (n != 0) {
                int lastDigit = n % 10;
                dec = dec + (int)(lastDigit * Math.pow(2,pow));
                pow++;
                n = n/10;
            }
        }
        else {
            System.out.println("invalid input");
        }
        return dec;
    }

    public static void main (String args[]) {
        System.out.println(factorial(10));

    }
}