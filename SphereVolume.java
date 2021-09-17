import java.util.Scanner;
public class SphereVolume {

    public static void main(String[] args)
    {
// add your declaration and code here
        double diam;
        double radius;
        double diameter;
        diameter= 2;
        double volume;
        Scanner in = new Scanner(System.in);
        System.out.println(" what is the diameter of a sphere");
        diam = in.nextDouble();
        radius = diameter/2.0;
        volume = (2) * Math.PI * Math.pow(radius,3);
        System.out.println("Volume equals " + volume);








    }
}