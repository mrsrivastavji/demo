import java.util.*;

public class Funcion{
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter your name: ");
    //     String name = sc.next();

    //     printMyName(name);
    // }

    // public static int calculateSum(int a, int b){
    //     int sum= a+b;
    //     return sum;
    // }

    // public static void main(String args[]){
    //      Scanner sc = new Scanner(System.in);
    //      int a= sc.nextInt();
    //      int b= sc.nextInt();

    //      int sum= calculateSum(a,b)
    //      System.out.println("Sum of 2 number is: "+ sum);

    // }

    // public static int calculateProduct(int a, int b){
    //     int pro= a*b;
    //     return pro;
    // }

    // public static void main(String args[]){
    //      Scanner sc = new Scanner(System.in);
    //      int a= sc.nextInt();
    //      int b= sc.nextInt();

    //      int pro= calculateProduct(a,b)
    //      System.out.println("Product of 2 number is: "+ pro);

    // }

    public static int fact(int n){
        if(n<0){
             System.out.println("Invalid number");
             return 0;
            }
        int fact=1;
        for(int i=n; i>0; i--){
            fact*=i;
        }
        return fact;
    }

    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int n= sc.nextInt();
         int fact= fact(n);
         System.out.println("Factorial is: "+ fact);

    }
}