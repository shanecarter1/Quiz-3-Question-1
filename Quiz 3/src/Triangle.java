
public class Triangle extends GeometricObject {
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle test = new Triangle(18,24,30);
		System.out.println(test.toString());
		System.out.println(test.getArea());
		System.out.println(test.getPerimeter());
	}

	@Override
	public double getArea() {
		//gets area of triangle
		double p = (side1 + side2 + side3)/2;
		double area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		return area;
	}

	@Override
	public double getPerimeter() {
		// gets perimeter of triangle
		double Perimeter = side1 + side2 + side3;
		return Perimeter;
	}
	//no arg constructor
	public Triangle(){
	}
	//specific instance constructor
	public Triangle(double newside1, double newside2, double newside3){
		side1 = newside1;
		side2 = newside2;
		side3 = newside3;
	}
	
	double getSide1(){
		return side1;
	}
	double getSide2(){
		return side2;
	}
	double getSide3(){
		return side3;
	}
	public String toString(){
		return "side1 =" + side1 + "\nside2 =" + side2 + "\nside3 =" + side3;
	}
}
