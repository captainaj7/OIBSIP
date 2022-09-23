                                                    /*NUMBER GUESSING GAME*/
package myproject;
import java.util.*;

public class Task1 
{
	public static void guessnumber()
	{
		Scanner sc=new Scanner(System.in);
		
		              //generating a random  number
		int number=1+(int)(100* Math.random());
		
		                 //Number of trails given
		int k=3;
		int points=100;
		int i=0;
		int guess;
		int round=0;
		int flag=0;
		
		System.out.println("A number is choose betwenn 1-100,Guess the number within 3 attempts and each round contains 3 trails");
		
		while(round!=2)
		{
		while(i!=k)
		{	
			System.out.println("Guess the  number");
			              //taking input
			System.out.println("You have " +(2-round)+ " rounds left");
			guess=sc.nextInt();
			            //checking the number
			if(number == guess)
			{
				System.out.println("Good Job!"+"You have guessed the number");
				System.out.println("Your points are "+points);
				flag=1;
				break;
		    }
			else if(number > guess && i != k-1)
			{
				points-=5;
				System.out.println("The number is greater than "+guess);
			}
			else if(number < guess && i != k-1)
			{
				points-=5;
				System.out.println("The number is smaller than "+guess);
			}
			i++;
		}
		
		if(flag==1)
			break;
		if(i==k)
		{
			points-=10;
			if(round!=2)
			{
				i=0;
				round++;
				continue;
			}
		}
		}
		                          //if tries are not left
		if(round==2)
		{
			System.out.println("You are out of your tries and No rounds are left");
			System.out.println("Number was: "+number+" Your points are 0");
		}
		
		
	}
	public static void main(String[]args)
	{
		               // calling the fucntion
		guessnumber();
		
	}

}
