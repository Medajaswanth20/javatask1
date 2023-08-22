package task1;
import java.util.*;
import java.util.Random;
public class codsoft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random r = new Random();
		int a;
		System.out.println("enter the number");
		a=sc.nextInt();
		//to read the numbers from the user
		System.out.println("the entered number is "+a);
		int ran_int;
		ran_int=r.nextInt(5);
		/*for limit 1 to 100 the syntax in
		 * ran_int=r.nextInt(100);
		 * for getting the true i taken the limit as 5
		 */
		System.out.println("the random number is "+ran_int);
		int count=1;
		if(ran_int==a)
		{
			System.out.println("the guess is correct");
		}
		else
		{
		for(ran_int=0;a!=ran_int;ran_int++)
		{
			System.out.println("enter the number");
			a=sc.nextInt();
			System.out.println("the entered number is "+a);
			ran_int=r.nextInt(5);
			System.out.println("the random number is "+ran_int);
			count++;
		if(ran_int!=a)
		{
			System.out.println("the guess is wrong");
		}
		else
		{
			System.out.println("the guess is correct");
			break;
		}
		}
		}
		//for display the count of the rounds
		System.out.println("the count is "+count);	
	}
}
