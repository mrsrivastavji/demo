import java.util.*;

class Rectrangle {
          public double length;
          public double breadth;
          public double area() {
                  return length*breadth;
           }
           public double perimeter() {
                  return 2*( length+breadth);
            }
            public boolean isSquare() {
            if(length==breadth)                  
             return true;
             else
             return false;
             }
}

public class rectrangleTest {
       public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Rectrangle  r1=new Rectrangle ();
            System.out.print("Enter the length: ");
            r1.length=sc.nextDouble();
            System.out.print("Enter the breadth: ");
            r1.breadth=sc.nextDouble();            
              
              System.out.println("Area :"+r1.area());
              System.out.println("Perimeter :"+r1.perimeter());
              System.out.println("Is it a Square :"+r1. isSquare());
         }
}
               