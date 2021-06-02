//***Lab 1: Shapes
//
//
//***

import java.util.Scanner;
import java.lang.Math;

public class Main_App {
	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("");
		
		sb.append("1. Construct a Circle\n");
		sb.append("2. Construct a Rectangle\n");
		sb.append("3. Construct a Square\n");
		sb.append("4. Construct a Triangle\n");
		sb.append("5. Construct a Sphere\n");
		sb.append("6. Construct a Cube\n");
		sb.append("7. Construct a Cone\n");
		sb.append("8. Construct a Cylinder\n");
		sb.append("9. Construct a Torus\n");
		sb.append("10. Exit the program\n");
		
		System.out.println("Welcome to my program. Would you like to construct a shape?");
		String cont ="";
		int menu_option = 0;
		cont = user_input.next();
		cont = cont.toUpperCase();
		
		if(cont!="Y") {
			System.exit(menu_option);
		}
		
		
		while(cont=="Y") {		
			if(cont!="Y") {
				System.exit(menu_option);
			}
		
			System.out.println(sb);
			menu_option = user_input.nextInt();
		

		
			if (menu_option==1) {
				System.out.println("What is the radius of the circle?");
				double radius = user_input.nextDouble();
				
				Circle circle = new Circle(radius);
				System.out.println("The area of the circle is "+ circle.area());
			}
			if (menu_option==2) {
				System.out.println("What is the length of the rectangle?");
				double length = user_input.nextDouble();
				System.out.println("What is the width of the rectangle?");
				double width = user_input.nextDouble();
				
				Rectangle rectangle = new Rectangle(width, length);
				System.out.println("The area is "+rectangle.area());
			}
			if (menu_option==3) {
				System.out.println("What is the length of the square?");
				double length = user_input.nextDouble();
				
				Square square = new Square(length);
				System.out.println("The area is "+square.area());
				
			}
			if (menu_option==4) {
				System.out.println("What is the base of the triangle?");
				double base = user_input.nextDouble();
				System.out.println("What is the height of the triangle?");
				double height = user_input.nextDouble();
				
				Triangle triangle = new Triangle(base, height);
				System.out.println("The area is "+triangle.area());
			}
			if (menu_option==5) {
				System.out.println("What is the radius of the sphere?");
				double radius = user_input.nextDouble();
				
				Sphere sphere = new Sphere(radius);
				System.out.println("The volume of the sphere is "+sphere.volume());
				
			}
			if (menu_option==6) {
				System.out.println("What is the width of the cube?");
				double width = user_input.nextDouble();
				System.out.println("What is the length of the cube?");
				double length = user_input.nextDouble();
				System.out.println("What is the height of the cube?");
				double height = user_input.nextDouble();
				
				Cube cube = new Cube(width, length, height);
				System.out.println("The volume of the cube is "+cube.volume());
			}
			if (menu_option==7) {
				System.out.println("What is the radius of the cone?");
				double radius = user_input.nextDouble();
				System.out.println("What is the height of the cone?");
				double height = user_input.nextDouble();
				
				Cone cone = new Cone(radius, height);
				System.out.println("The volume of the cone is "+cone.volume());
			}
			if (menu_option==8) {
				System.out.println("What is the radius of the cylinder?");
				double radius = user_input.nextDouble();
				System.out.println("What is the height of the cylinder?");
				double height = user_input.nextDouble();
				
				Cylinder cylinder = new Cylinder(radius, height);
				System.out.println("The volume of the cylinder is "+ cylinder.volume());
			}
			if (menu_option==9) {
				System.out.println("What is the major radius of the torus?");
				double majorRadius = user_input.nextDouble();
				System.out.println("What is the minor radius of the torus?");
				double minorRadius = user_input.nextDouble();
				
				Torus torus = new Torus(majorRadius, minorRadius);
				System.out.println("The volume of the torus is "+ torus.volume());
			}
			if (menu_option==10) {
				java.lang.System.exit(menu_option);
			}
			System.out.println("Would you like to construct another shape? Y/N");
			cont = user_input.next();
			cont = cont.toUpperCase();
			
		
		}
	}
}
