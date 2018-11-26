import java.math.BigInteger;
import java.util.*;

public class p3 {

    /*
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * 
     * What is the largest prime factor of the number 600851475143 ?
     */
    public static void main(String [ ] args){
        long a = 600851475143L;
        System.out.println(solution(a));
 
    }
    
   /* Solving Though process
    * 1. brute force and find the biggest prime number smaller then this number and divisible -> O(n)
    * 2. use prime factor property. Keep dividing when find divisible number.
    */
    public static long solution(long n){
        long factor = -1;
        for (int i = 2; i * i <= n; i++) {
            if (n == 1) 
                break;
            if (n % i != 0) 
                continue;
            factor = i;
            while (n % i == 0) {
                n /= i;
            }
        }
        return n == 1 ? factor : n;
    }
}
