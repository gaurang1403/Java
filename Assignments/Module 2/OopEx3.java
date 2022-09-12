package Module_2;

class Area {

	public void area(double l) {
		double areaOfSquare = l * l;
		System.out.println("Area of Square is: " + areaOfSquare);
	}

	public void area(double l, double b) {
		double areaOfRectangle = l * b;
		System.out.println("Area of Rectangle is: " + areaOfRectangle);
	}

}

public class OopEx3 extends Area {
	public static void main(String[] args) {
		
		Area a1 = new Area();
		Area a2 = new Area();
		
		a1.area(5);
		System.out.println("----------------------------------");
		a2.area(15, 20);
	}

}
