import java.util.*;

public class Sorting{
    public static void main(String args[]){
        System.out.print("Enter length of array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
         System.out.print("Enter element of array: ");
        for(int i=0; i<n; i++){
            A[i]=sc.nextInt();
        }
        
        for(int i=0; i<n-1; i++){
            int smallest=i;
            for(int j=i+1; j<n; j++){
                if(A[smallest]>A[j]){
                    smallest=j;
                }
            }
            int temp=A[smallest];
            A[smallest]=A[i];
            A[i]=temp;
        }
        System.out.print("Sorted element of array: ");
        for(int i=0; i<n; i++){
            System.out.print(A[i]+" ");
        }
    }
}