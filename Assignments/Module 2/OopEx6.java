package Module_2;

class Rectangle {
	double length;
	double breadth;

	Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void Area() {
		double area = (length * breadth);
		System.out.println("Area of given Rectangle: " + area);
	}

	public void Perimeter() {
		double perimeter = 2 * (length * breadth);
		System.out.println("Perimeter of given Rectangle is: " + perimeter);
	}
}

	class Square extends Rectangle {

		public Square(double s) {
			super(s, s);
		}

	}



class OopEx6 {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(5, 5);
		Square s = new Square(5);
		r1.Area();
		System.out.println("-------------------------------------");
		r1.Perimeter();
		System.out.println("-------------------------------------");
		s.Area();
		System.out.println("-------------------------------------");
		s.Perimeter();

	}

}
