import java.util.*;

public class pattern{
    public static void main(String arg[]){
        // Scanner sc= new Scanner(System.in);
        // System.out.print("Enter no of rows: ");
        // int row=sc.nextInt();
        // System.out.print("Enter no of columns: ");
        // int col=sc.nextInt();

        // for(int i= 1; i<=row; i++){
        //     for(int j=1; j<=col; j++){
        //         //System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=4; i++)
        // {
        //     for(int j=1; j<=5; j++){
        //         if(i==1|| i==4 || j==1|| j==5){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=5; i>0; i--){
        //     for(int j=i; j>0; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=5; j++){
        //         if(5-i>=j){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        //}

        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=5; i>0; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        int k=1;
        // for(int i=1; i<=5; i++){
        //         for(int j=1; j<=i; j++){
        //             System.out.print(k+" ");
        //             k++;
        //         }
        //         System.out.println();
        //     }

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0)
                System.out.print(1+" ");
                else
                System.out.print(0+" ");
                
            }
            System.out.println();
        }
    }
}