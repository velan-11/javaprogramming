package Loops;

public class Prog38 {
    public static void main(String[] args) {
        fibonacci(5000);
    }

    public static void fibonacci(int limit) {
        int n = 0;
        int n1 = 1;

        while (n1 < limit) {
            
            int sum = n + n1;
            n = n1;
            n1 = sum;

           
            boolean isPrime = true;
            if (n1 <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(n1); i++) {
                    if (n1 % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(n1 + " is a prime number.");
            }

           
            int temp = n1;
            int digitCount = 0;

           
            while (temp != 0) {
                digitCount++;
                temp /= 10;
            }

            temp = n1;
            int armstrongSum = 0;

           
            while (temp != 0) {
                int digit = temp % 10;
                int c=digitCount;
                int prod=1;
                while(c>0) {
                	prod=prod*digit;
                	c--;
                }
                armstrongSum+=prod;
                temp /= 10;
            }

            if (armstrongSum == n1) {
                System.out.println(n1 + " is an Armstrong number.");
            }
        }
    }
}
