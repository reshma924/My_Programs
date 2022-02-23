package Java_Programs;


public class car {
	enum name{audi,suzuki,Ford,Renault};
	enum model{};
	enum type{petrol,diseal,EV};
	
	
	public int  CalculateSpeed( int distance,int time) {
	
		 int speed=distance/time;
		 System.out.println( "speed is:"+speed);
		return speed;
		
		}
	
		 
	
	public  void  CheckSpeedLimit(int speed) {
	
		if(speed>50) {
			
			System.out.println("Alert message will be displayed");
		
		}
		else {
			System.out.println("Alert message will  not be displayed");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		name N=name.audi;
		System.out.println(N);
		type  t1=type.petrol;
		System.out.println(t1);
        car c1=new car();
        c1.CalculateSpeed(500, 2);
        c1.CheckSpeedLimit(250);
        c1.CalculateSpeed(100, 5);
        c1.CheckSpeedLimit(20);
        c1.CalculateSpeed(10, 1);
        
        c1.CheckSpeedLimit(10);
        
        c1.CalculateSpeed(100000, 500);
        c1.CheckSpeedLimit(200);
	}

}

