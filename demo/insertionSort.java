import java.util.*;

public class insertionSort{
    public static void main(String args[]){
        System.out.print("Enter length of array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.print("Enter element of array: ");
        for(int i=0; i<n; i++){
            A[i]=sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            int cur=A[i];
            int j=i-1;
            while(j>=0 && cur<A[j]){
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=cur;
        }
        System.out.print("Sorted element of array: ");
        for(int i=0; i<n; i++){
            System.out.print(A[i]+" ");
        }
    }
}
