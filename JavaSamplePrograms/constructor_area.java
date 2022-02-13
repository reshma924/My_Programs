package Java_Programs;


class  Rectangle{
	int length=4;
	int breadth=3;
	Rectangle(){
		
	}
		public void area() {
			int rectarea=length* breadth;
			System.out.println("area is:"+rectarea);
	}
	
}

public class constructor_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle ey1=new Rectangle();
		ey1.area();
	}

}
