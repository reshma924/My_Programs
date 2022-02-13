package Java_Programs;

import java.util.Scanner;

public class Employee_information {
	
		String name;
		float salary;
		String designation;
		
		public void display () {
			
			System.out.println("name is:"+name+"\nsalary is:"+salary+"\n designation is:"+designation);
		}
		public class Employee1 extends Employee_information{
	                public static void main(String[] args) {
	
		

			
				Employee_information e1=new Employee_information();
				Scanner sc=new Scanner(System.in);
				System.out.println("enter name:");
				e1.name=sc.nextLine();
				System.out.println("enter salary:");
				e1.salary=sc.nextFloat();
				System.out.println("enter designation:");
				e1.designation=sc.nextLine();
				e1.display();
				
			

		}
			}
		}


