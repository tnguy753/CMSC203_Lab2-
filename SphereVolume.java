import java.util.Scanner;
public class SphereVolume {
public static void main(String[] args) 
	{ 
	// add your declaration and code here 
	Scanner input = new Scanner(System.in);
	double diam, radi, v;
	// Print purpose of the program
	System.out.println("Calculate the sphere volume");
	// Print a prompt asking for the diameter of a sphere
	System.out.println("Please enter diameter: ");
		diam = input.nextDouble();
	// Read the diameter
		System.out.println("The diameter is " + diam );
	// Calculate the radius 
	radi  = diam*1.0/2;
	// Calculate the volume of the sphere
	v= Math.pow(radi, 3)*Math.PI*4/3;
	// Print the volume
	System.out.println("The volume is " + v );
	input.close();
	} 

}



