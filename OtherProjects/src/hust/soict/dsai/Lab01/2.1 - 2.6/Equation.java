import java.util.Scanner;
import java.lang.Math;
public class Equation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a: "); 
        Double a = keyboard.nextDouble();

        System.out.println("Enter b: "); 
        Double b = keyboard.nextDouble();

        System.out.println("Equation: " + a +"x + " + b + " = 0");
        if(a == 0) {
            if(b == 0) {
                System.out.println("Infinite solution");
            }else{
                System.out.println("No solution");
            }
        }else{
            Double x = -b/a;
            System.out.println("Solution: x= " + x);
        }


        System.out.println("Enter a1: ");  
        Double a1 = keyboard.nextDouble();

        System.out.println("Enter b1: ");  
        Double b1 = keyboard.nextDouble();

        System.out.println("Enter c1: ");  
        Double c1 = keyboard.nextDouble();

        System.out.println("Enter a2: ");  
        Double a2 = keyboard.nextDouble();

        System.out.println("Enter b2: ");  
        Double b2 = keyboard.nextDouble();

        System.out.println("Enter c2: ");  
        Double c2 = keyboard.nextDouble();

        System.out.println("Equation: " );
        System.out.println(a1 +"x + " + b1 + "y = " + c1);
        System.out.println(a2 +"x + " + b2 + "y = " + c2);

        Double d = a1*b2 - a2*b1;
        Double d1 = c1*b2 - c2*b1;
        Double d2 = a1*c2 - a2*c1;  

        if(d==0) {
            if(d1 == 0 && d2 == 0) {
                System.out.println("Infinite solution");
            } else {
                System.out.println("No solution");
            }
        } else {
            Double x1 = d1/d;
            Double x2 = d2/d;
            System.out.println("Solution: x1 = " + x1 + ", x2 = " + x2);
        }

        System.out.println("Enter a: "); 
        Double a3 = keyboard.nextDouble();

        System.out.println("Enter b: "); 
        Double b3 = keyboard.nextDouble();

        System.out.println("Enter c: "); 
        Double c3 = keyboard.nextDouble();

        System.out.println("Equation: " + a3 +"x^2 + " + b3 + "x +" + c3 + " = 0");
        Double delta = b3*b3 - 4*a3*c3;
       
        if(a3==0) {
            if(b3==0) {
                if(c3==0) {
                    System.out.println("Infinite solution");
                } else {
                    System.out.println("No solution");
                }
            } else {
                Double x = -c3/b3;
                System.out.println("Solution x = " + x);
            }
        } else {
            if(delta<0) {
                System.out.println("No Solution");
            } else if(delta==0) {
                Double x = (-b3/2)*a3;
                System.out.println("Solution: x1 = x2 = " + x);
            } else {
                Double x1 = (-b3-Math.sqrt(delta))/(2*a3);
                Double x2 = (-b3+Math.sqrt(delta))/(2*a3);
                System.out.println("Solution: x1 = " + x1 + ", x2 = " + x2);
            }
        }
        keyboard.close();
    }
}
