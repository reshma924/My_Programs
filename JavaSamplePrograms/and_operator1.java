package Java_Programs;

import java.util.Scanner;

public class and_operator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a");
int a=sc.nextInt();
System.out.println("Enter the value of b");
int b=sc.nextInt();
System.out.println("Enter the value of c");
int c=sc.nextInt();
if((a>b)&&(a>c)) {
	System.out.println("a is greater");
	
}
else if((b>c)&&(b>a)) {
	System.out.println("b is greater");
	
}
else {
	System.out.println("c is greater");
	
}

	
}

	}


