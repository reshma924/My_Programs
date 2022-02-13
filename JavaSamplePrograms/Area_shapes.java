package Java_Programs;
abstract class shape{
	abstract void RectangleArea(int l,int b);
	abstract void SquareArea(int a);
	abstract void CircleArea(int r);
	
}
class area{
	public void RectangleArea(int l,int b) {
		System.out.println("Area of the rectangle is:"+l*b);
	}
	public void SquareArea(int a) {
		System.out.println("Area of the square is:"+a*a);
	}
	public void CircleArea(int r) {
		System.out.println("Area of the circle is:"+(3.14*r*r));
	}
}


	
	
public class Area_shapes {

	public static void main(String[] args) {
		area aa=new area();
		aa.RectangleArea(3, 4);
		aa.RectangleArea(2, 4);
		aa.SquareArea(3);
		aa.CircleArea(2);
	// TODO Auto-generated method stub

	}

}
