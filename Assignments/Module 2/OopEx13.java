package Module_2;

abstract class Shape {

	abstract public void RectangleArea(double l, double b);

	abstract public void SquareArea(double l);

	abstract public void CircleArea(double r);

}

class Area1 extends Shape {

	@Override
	public void RectangleArea(double l, double b) {

		double AreaOfRectangle = (l * b);
		System.out.println("Area of Rectangle is " + AreaOfRectangle);

	}

	@Override
	public void SquareArea(double l) {
		double AreaOfSquare = (l * l);
		System.out.println("Area of Square is " + AreaOfSquare);
	}

	@Override
	public void CircleArea(double r) {
		double pi = 3.14;
		double AreaOfCircle = (pi) * (r * r);
		System.out.println("Area of Circle is " + AreaOfCircle);
	}

}

public class OopEx13 {

	public static void main(String[] args) {
		Area1 a = new Area1();
		a.RectangleArea(1.2, 2.4);
		System.out.println("----------------------------------------");
		a.CircleArea(5.5);
		System.out.println("----------------------------------------");
		a.SquareArea(6.9);
}
}