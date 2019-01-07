import java.util.*;

public class q4 {
    public static void main(String [ ] args){
        long a = 600851475143L;
        System.out.println(solution());
 
    }
    
    /* Solving Though process
     * 1. brute force, 100 ~ 999 find palindrome.
     * 2. one number has to be 999 go from 999 * 999 and decrease 1 number check palindrome
     */
    public static int solution(){
        
        int max = 0;
        for(int j = 100; j < 999; j ++) {
            for(int i = 100; i < 999; i++) {
                if(isPal( i * j)) {
                   max = Math.max(i * j, max); 
                } 
                
            }
        }
        
        return max;
        
    }
    
    public static boolean isPal(int n) {
        String a = Integer.toString(n);
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                return false;
            }
        }
        return true;
        
        
    }
}