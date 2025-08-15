import java.util.*;

public class findGCD{
    static int GCD(int n, int m){
        while(n!=m){
            if(n>m)n=n-m;
            else m=m-n;
        }
        return m;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,m;
        System.out.print("Enter the number: ");
        n=sc.nextInt();
        m=sc.nextInt();
        System.out.println("The GCD is: "+GCD(n,m));
    }
}