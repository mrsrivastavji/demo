import java.util.*;

class Sorting{
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
            for(int j=0; j<n-i-1; j++){
                if(A[j]>A[j+1]){
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
        System.out.print("Sorted element of array: ");
        for(int i=0; i<n; i++){
            System.out.print(A[i]+" ");
        }
    }
}