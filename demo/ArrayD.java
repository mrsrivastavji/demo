import java.util.*;

public class ArrayD{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int n= sc.nextInt();
        System.out.print("Enter no of columns:");
        int m= sc.nextInt();

        int matrix[][] =new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter element to search:");
        int s= sc.nextInt();


        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(s==matrix[i][j]){
                    System.out.print("Element is present at :" +matrix[i][j]);
                }
            }
        }
        
        
    }
}