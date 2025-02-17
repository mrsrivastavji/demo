import java.util.*;

public class switcH {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter button number: ");
        int button= sc.nextInt();

        switch(button){
            case 1: System.out.println("Button 1 was pressed");
            break;
            case 2: System.out.println("Button 2 was pressed");
            break;
            case 3: System.out.println("Button 3 was pressed");
            break;
            default: System.out.println("Invalid button was pressed");
        }
    }
    
}
   