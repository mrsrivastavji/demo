import java.util.*;

class BuilderString{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("H");
        System.out.println(sb);
        //System.out.println(sb.charAt(0));
        
         sb.setCharAt(0,'P');
        // System.out.println(sb);
        
         sb.insert(0,'S');
        // System.out.println(sb);
        
         sb.insert(2,'n');
        // System.out.println(sb);
        
         sb.delete(0,3);
        // System.out.println(sb);
        /*This method takes less time than
        str+='e'
        Since it do not create new string
        so it takes less time to execute*/
        
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        // System.out.println(sb);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder s = new StringBuilder(input);
        
        for(int i=0; i<s.length()/2; i++){
            int front= i;
            int back = s.length()-1-i;
            
            char frontChar=s.charAt(front);
            char backChar=s.charAt(back);
            
            s.setCharAt(front,backChar);
            s.setCharAt(back,frontChar);
            
        }
        System.out.println(s);
        
    }
}