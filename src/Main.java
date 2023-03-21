/*
Question : Write a Java Program to Find the Area of a Triangle Using Heron’s formula.
________________________________________________________
Case 1 (Simple Test Case):
Enter the three sides of the triangle
14
56
43
Area of the triangle is 127.31236192923294
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double semiParameter,side1,side2,side3;
        System.out.println("Enter the first side of triangle :");
        side1 = sc.nextDouble();
        System.out.println("Enter the first second of triangle");
        side2 = sc.nextDouble();
        System.out.println("Enter the first third of triangle");
        side3 = sc.nextDouble();
        semiParameter = (side1 + side2 + side3) / 2;
        System.out.println("Firstly , printing the semiParameter value : " + semiParameter);
        semiParameter = semiParameter * (semiParameter - side1) * (semiParameter - side2) * (semiParameter - side3);
        System.out.println("Printing the final result : " + Math.sqrt(semiParameter));
    }
}