import java.util.*;

public class printTheDigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int num,r;
        System.out.print("Enter the number:");
        num=sc.nextInt();
        
        String rev="";
        
        while(num>0){
            r=num%10;
            rev=rev+r;
            num=num/10;
        }
        
        for(int i=rev.length()-1;i>=0; i--){
            char c=rev.charAt(i);
            
            switch(c){
                case '0': System.out.print("Zero ");
                break;
                case '1': System.out.print("One ");
                break;
                case '2': System.out.print("Two ");
                break;
                case '3': System.out.print("Three ");
                break;
                case '4': System.out.print("Four ");
                break;
                case '5': System.out.print("Five ");
                break;
                case '6': System.out.print("Six ");
                break;
                case '7': System.out.print("Seven ");
                break;
                case '8': System.out.print("Eight ");
                break;
                case '9': System.out.print("Nine ");
                break;
            }
            
        }
    }
}
