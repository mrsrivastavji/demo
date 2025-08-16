import java.util.*;

public class recursion {
    static void first(int n){
        if(n>0){
            first(n-1);
            System.out.println(n);
            
        }
    }

    static void firs(int n){
        if(n>0){
            System.out.println(n);
            firs(n-1);
            
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=sc.nextInt();
        first(n);
        firs(n);
    }
}