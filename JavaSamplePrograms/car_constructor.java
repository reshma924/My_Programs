package Java_Programs;
public class car_constructor {
	String brand="Suzuki";
	car_constructor(){
		System.out.println("car is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car_constructor c1=new car_constructor();
		System.out.println(c1.brand);
	}

}
