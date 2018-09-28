package week2;

/**
 *
 * @author Administrator
 */
public class Task1 {

    public static int gcd(int a, int b) {
    if(b==0) return a;
    return gcd(b,a%b);
// TODO: Tính ước chung lớn nhất của 2 số a, b
     
    }
    
    public static int fibonacci(int n) {
        if(n==0) return 0;
        else if(n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
        // TODO: Tìm số fibonacci ở vị trí n
        
    }

   

public static void main(String[] arg){

    System.out.println(gcd(4,6));
    System.out.println(fibonacci(4));
}
}
