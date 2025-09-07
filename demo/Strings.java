import java.util.*;
// Strings are immutable
class Strings {
    public static void main(String[] args) {
        String name= "shivam srivastav";
        String fullName= "Shivam Srivastav";
        String sentance = "My name is Shivam";

        Scanner sc= new Scanner(System.in);
        String fName=sc.nextLine();
        System.out.println(name);
        System.out.println(sentance);
        System.out.println(sentance.substring(15,20));
        System.out.println(fName);
        System.out.println(fName.length());
        System.out.println(name + " " + sentance);
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
        
        if(name.compareTo(fullName)==0){
            System.out.println("Both name are same");
        }
        else{
            System.out.println("Both name are not same");
        }
}
