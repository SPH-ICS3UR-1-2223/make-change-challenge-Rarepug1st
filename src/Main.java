import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("how much cash do you have ");
		double money = in.nextDouble();
		System.out.println("you have " + money + " dollars");
		System.out.println("What is the total price of the items you bought");
		double Spent = in.nextDouble();
		double change= money-Spent;
		if(money<Spent)
		
		{System.out.println("nice try");
			}
	
		//Your challenge is to read in a price
		if(money>=Spent) {
			
		System.out.println("your total is "+Spent+" dollars");
		int num100=(int)(change/100);
		System.out.println("your change is  " +num100+" 100 Dollar bills");
		change = change-num100*100;
		
		int num50= (int)(change/50);
	
		System.out.println("you change is "+ num50+" 50 Dollar bills");
		change = change-num50*50;
		int num25 = (int)(change/25);
		System.out.println("your change is "+ num25 +" 25 dollar bills");
		change = change-num25*25;
		int num10 =(int)(change/10);
		System.out.println("your change is " + num10 +" 10 dollar bills");
		
		change=change-num10*10;
		
		int num5=(int)(change/5);
		System.out.println("your change is " + num5 +" dollar bills");
		change= change-num5*5;
		
		int num2 = (int)(change/2);

		System.out.println("your change is"+ num2 + " dollar bills");
		change = change-num2*2;
		
		int num1=(int)(change/1);

		System.out.println("your change is " + num1 + " dollar bills");
		
		change = change-num1*1;
		
		int num025 = (int)(change/0.25);

		System.out.println(" your change is "+num025+ " dollar bills");
		change= change-num025*0.25;

		int num005 = (int)(change/0.05);
if(num005>1)
		{System.out.println("your change is "+ num005 +" dollar bills");
		change= change-num005*0.05;
		}
		}
		//Read in the amount paid

		 
		//Print out the amount of change
		 
		
		//Break the change into all denominations: 
		//$100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
		//As a bonus, make your project round to the nearest $0.05 like actual stores.
		
	}

}
