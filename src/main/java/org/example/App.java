package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int length;
        int width;
        int area;
        double areaMetric;
        final double conv = 0.09290304;

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the length of the room? ");
        length = sc.nextInt();

        System.out.print("What is the width of the room? ");
        width = sc.nextInt();

        area = length * width;
        areaMetric = area * conv;

        System.out.println("You entered the dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is");
        System.out.println(area + " square feet");
        System.out.println(areaMetric + " square meters");
    }
}
