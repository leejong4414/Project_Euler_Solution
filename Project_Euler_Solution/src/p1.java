import java.util.*;

public class p1{ 
    // Question. 
    // If we list all the natural numbers below 10 that are multiples of 3 or 5, 
    // we get 3, 5, 6 and 9. The sum of these multiples is 23.
    // Find the sum of all the multiples of 3 or 5 below 1000.
    public static void main(String [ ] args){
        System.out.println(solution(1000));

    }
    
    // Solving thought process
    
    // 1. we can brute force and check all number below given number and add -> O(n)
    // 2. we can know how many numbers below n that is multiple of a by dividing. Maybe use that
    // a*(1+2+..+(n-1)/a) will give total sum for that a.
    // Using summation identity (1+2+..+(n-1)/a) = ((n-1)/a+1)*((n-1)/a)/2 -> O(# of a)

    
    public static int solution(int n){
        
        int res = 0;
        int[] as = new int[] {3,5};
        for(int i = 0; i < as.length ; i++){
            int a = as[i];
            res += ((n-1)/a+1)*((n-1)/a)/2*a;
        }
        res -= ((n-1)/15+1)*((n-1)/15)/2*15;
        return res;

    }

}
