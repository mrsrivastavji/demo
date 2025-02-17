import java.util.*;

public class tablePrint {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int a=sc.nextInt();
        //System.out.println("The tabe of the number is");

        for(int i=1; i<=10; i++){
            //System.out.println(a*i);
        }

        int i=1,sum=0;
        while(i<=a){
            sum +=i;
            i++;
        }
        System.out.println(sum);

    }
    
}
