package Module_2;

class Triangle {

	public void Area(double h, double b) {
		double Area = (h * b) / 2;
		System.out.println("Are for given Triangle is: " + Area);
	}

	public void Perimeter(double a, double b, double c) {
		double perimeter = a + b + c;
		System.out.println("Perimeter for given Triangle is " + perimeter);
	}
}

public class OopEx7 extends Triangle {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.Perimeter(3, 4, 5);
		System.out.println("-----------------------------------");
		t.Area(4, 8);
	}
}
