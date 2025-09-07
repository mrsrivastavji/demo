import java.util.*;

class Cylinder {
          public double radius;
          public double height;
          public double lidArea() {
                  return Math.PI*radius*radius;
            }
           public double totalSurfaceArea() {
                  return 2* lidArea()+circumference()*height;
            }
            public double circumference() {
                  return 2*Math.PI*radius;
            }
            public double volume() {
                  return lidArea()*height;
            }

}

public class cylinderInfo {
      public static void main(String[] args) {
            Cylinder c=new Cylinder();
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the radius: ");
            c.radius=sc.nextDouble();
            System.out.print("Enter the height: ");
            c.height=sc.nextDouble();            
              
            System.out.println("Lid Area :"+c.lidArea());
            System.out.println("Total Area :"+c.totalSurfaceArea());
            System.out.println("Circumference :"+c.circumference());
            System.out.println("Volume :"+c.volume());
      }
}
               