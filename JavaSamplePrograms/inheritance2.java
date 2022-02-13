package Java_Programs;
class Animal{
	public void Barks() {
		System.out.println("animal is barking");
		
	}
}
 class Bark extends Animal {
	public void show() {
		System.out.println("dogs are is dancing");
	}

 }
public class inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bark b1=new Bark();
		b1.Barks();
		b1.show();
	}

}
