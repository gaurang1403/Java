package Module_2;
class Shape1{
	public void shapeprint() {
		System.out.println("This is Shape");
	}
}
class Rectangle1 extends Shape1{
	public void Rechangleprint() {
		System.out.println("This is Rectanglar shape");
	}
}
class Square1 extends Rectangle1{
	public void squareprint() {
		System.out.println("Square is a Rectangle");
	}
}
class Circle extends Shape1{
	public void circleprint() {
		System.out.println("This is Circular shape");
	}
}
public class OopEx15 {

	public static void main(String[] args) {
		
		Square1 s = new Square1();
		s.Rechangleprint();
		s.shapeprint();
	}
	
}
