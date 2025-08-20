import java.util.*;

class Circle {
        public double radius;
        public double area() {
            return Math.ceil(Math.PI*radius*radius);
        }
        public double perimeter() {
            return Math.ceil(2*Math.PI*radius);
        }
        public double circumference() {
            return perimeter();
        }
}

public class classInfo {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius: ");
        Circle c1=new Circle();
        c1.radius=sc.nextDouble();             
              
        System.out.println("Area :"+c1.area());
        System.out.println("Perimeter :"+c1.perimeter());
        System.out.println("Circumference :"+c1.circumference());
        }
}
