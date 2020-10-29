package week2Homework;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 1.99;
		double moneyInWallet = 10;
		int thirstLevel = 1;
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		System.out.println("I will buy Ice Cream " + "- " + shouldBuyIcecream);
		
		boolean willGoSwimming = isHotOutside && !isWeekday; 
		System.out.println("I will go swimming " + "- " + willGoSwimming);
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		System.out.println("It is a good day " + "- " + isAGoodDay);
		
		boolean willBuyMilk = (isHotOutside && thirstLevel >=3) && (moneyInWallet >=costOfMilk*2); 
		System.out.println("Will buy milk " + "- " + willBuyMilk);
				
		//Loops
		System.out.println("5a");		
		int a = 0;
		while (a < 100) {
			System.out.println(a);
			a +=2;
		}
				
		System.out.println("5b");
		int i = 100;
		while (i >= 0) { 
			System.out.println(i);
			i -= 3;
			}
		
		System.out.println("5c");
		for (int b = 1;b < 100; b +=2) {
		System.out.println(b);
		}
		
		System.out.println("5d");
		for(int number = 0; number < 100; number ++) {
			if(number % 3 == 0 && number % 5 ==0) {
				System.out.println("HelloWorld");
			}
			else if(number % 5 == 0) {
				System.out.println("World");
			}
			else if(number % 3 == 0) {
				System.out.println("Hello");
			}
			else {
				System.out.println(number);
			}
			}
		}
		
		
		
		
		}

	
		
	

