        //import scanner
import java.util.Scanner;

public class Volumeofcylinder {
    public static void main(String[] args) {
        //call an instance of scanner
        Scanner input = new Scanner(System.in);
        //ask for user for hieght of cylinder
        System.out.print("Enter the hieght of your cylinder:");
        double height = input.nextDouble();
        //ask user for radius of cylinder
        System.out.print("Enter the radius of your cylinder:");
        double radius = input.nextDouble();
        //declare CONSTANT PI
        final double PI = 3.14169;
        //declare double area of cylinder base using area = PI radius * radius
        double area = PI * radius * radius;
        //declare double volume of cylinder using volume = area * hieght
        double volume = area * height;
        //return volume of cylinder
        System.out.println("A cylinder with a radius of " + radius + ", and a height of " + height + ".  Has an area of:" + area + ", and a volume of:" + volume + ".");
    }
}