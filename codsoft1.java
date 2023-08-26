package task2;
import java.util.*;
public class codsoft1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks of java");
		int a,b,c,d,sum=0;
		a=sc.nextInt();
		System.out.println("enter the marks of python");
		b=sc.nextInt();
		System.out.println("enter the marks of c");
		c=sc.nextInt();
		System.out.println("enter the marks of Mysql");
		d=sc.nextInt();
		System.out.println("marks entered in java out of 100 is "+a+"\n"+"marks entered in python out of 100 is "+b);
		System.out.println("marks entered in c out of 100 is "+c+"\n"+"marks entered in Mysql out of 100 is "+d);
		sum=a+b+c+d;
		System.out.println("the sum of the marks  is "+sum);
		int avg=sum/4;
		System.out.println("the avg percentage is "+avg);
		if(avg>90)
			System.out.println("the grade is O");
			else if(avg<=90)
			System.out.println("the grade is A+");
			else if(avg<=80)
				System.out.println("the grade is A");
			else if(avg<=70)
				System.out.println("the grade is B+");
			else if(avg<=60)
				System.out.println("the grade is B");
			else if(avg<=50)
				System.out.println("the grade is Fail");
		
		
	}

}
