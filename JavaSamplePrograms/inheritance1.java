package Java_Programs;

abstract  class Parents {
	abstract void message(); 
}
class subclass1  extends Parents{
	public void message() {
		System.out.println("This is first subclass");
	}
}
class subclass2  extends Parents{
		public void message() {
			System.out.println("This is second subclass");
		}
	}
		
	



public class inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subclass1 sc=new subclass1();
		sc.message();
		subclass2 scl=new subclass2();
		scl.message();
	}

}
