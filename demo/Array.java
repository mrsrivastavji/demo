import java.util.*;

public class Array{
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter no of Students:");
    //     int n=sc.nextInt();
    //     int marks[]= new int[n];
    //     System.out.print("Enter marks of Students:");
    //     for(int i=0; i<n; i++){
    //         marks[i]=sc.nextInt();
    //     }

    //     for(int i=0; i<n; i++){
    //         System.out.println("Marks of Students: "+ marks[i]);
    //     }
    // }

    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter size: ");
            int n=sc.nextInt();
            int marks[]= new int[n];
            System.out.print("Enter values: ");
            for(int i=0; i<n; i++){
                marks[i]=sc.nextInt();
            }

            System.out.print("Enter element to search: ");
            int s=sc.nextInt();
            int i;
            for(i=0; i<n; i++){
                if(s==marks[i]){
                    System.out.println("Element is found at: "+ i);
                }
                else{
                    continue;
                }
            }

    }

}