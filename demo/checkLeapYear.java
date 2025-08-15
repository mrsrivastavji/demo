import java.util.*;

public class checkLeapYear {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.print("Enter the year to check: ");
        year=sc.nextInt();
        
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Entered year is a leap year.");
                }
                
                else {
                    System.out.println("Entered year is not a leap year.");
                }
            }
            
            else {
                System.out.println("Entered year is a leap year.");
        }
    }
    
    else {
        System.out.println("Entered year is not a leap year.");
        }
    }
}
