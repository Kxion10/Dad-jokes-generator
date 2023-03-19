package dadjokes;

//Import the needed number generator and scanner
import java.util.Random;

import java.util.Scanner;

public class DadJokes {

	public static void main(String[] args) {
		
		//initiate an array of dad jokes to reference from
		String[] Dadjoke = {"Two guys walked into a bar, the third one ducked.",
							"What did the traffic light say to the car as it passed? \"Don't look I'm changing!\"",
							"How do you tell the difference between a crocodile and an alligator? You will see one later and one in a while.",
							"Why does a Moon-rock taste better than an Earth-rock? Because it's a little meteor.",
							"I used to be addicted to the hokey pokey, but I turned myself around.",
							"Toasters were the first form of pop-up notifications.",
							"Feeling pretty proud of myself. The Sesame Street puzzle I bought said 3-5 years, but I finished it in 18 months.",
							"Why do you never see elephants hiding in trees? Because they're so good at it.",
							"Chances are if you' ve seen one shopping center, you've seen a mall.",
							"I asked the surgeon if I could administer my own anesthetic, they said: go ahead, knock yourself out.",
							"What did Romans use to cut pizza before the rolling cutter was invented? Lil Caesars",
							"What do you call a pig that knows karate? A pork chop!",
							"\"What time is it?\" I don't know... it keeps changing.",
							"Why are mummys scared of vacation? They're afraid to unwind.",
							"I was wondering why the frisbee was getting bigger, then it hit me.",
							"When does a joke become a dad joke? When it becomes apparent.",
							"I wish I could clean mirrors for a living. It's just something I can see myself doing.",
							"Why are fish easy to weigh? Because they have their own scales.",
							"A man walked in to a bar with some asphalt on his arm. He said “Two beers please, one for me and one for the road.”",
							"I started a new business making yachts in my attic this year...the sails are going through the roof."
							};
		
		//Testing to see the array length is 20
		//System.out.println(Dadjoke.length);
		
		//initiate a counter for the number of jokes told
		int JokeCounter = 0;
		
		// boolean to keep looping as long you want to hear dad jokes
		boolean MoreJokes = true;
		
		// Ask if the user wants to hear a dad joke
		System.out.println("Would you like to hear 4 dad jokes?");
		
		//open the random number generator
		Random random = new Random();
		
		//open the scanner
		Scanner scanner = new Scanner(System.in);
		
		//Initiate a while loop to loop as long as someone wants to hear jokes
		while(MoreJokes == true) 
			{
				
			//Open the scanner to save response
			String Ask = scanner.next();
			
			// if statement; if the answer is yes, we tell them the dad jokes in sets of 4
			if (Ask.equalsIgnoreCase("yes"))
				{
				//Generate 4 random numbers to pull from the dad joke array
				int joke0 = random.nextInt(Dadjoke.length);
				int joke1 = random.nextInt(Dadjoke.length);
				int joke2 = random.nextInt(Dadjoke.length);
				int joke3 = random.nextInt(Dadjoke.length);
				
				//Tell them the jokes
				System.out.println("Okay here are four random dad jokes:");
	
				// Jokes reference the array based on random number generated
				System.out.println("Here is Dad joke #" + joke0 + ". " + Dadjoke[joke0] + ".");
				System.out.println("Here is Dad joke #" + joke1 + ". " + Dadjoke[joke1] + ".");
				System.out.println("Here is Dad joke #" + joke2 + ". " + Dadjoke[joke2] + ".");
				System.out.println("Here is Dad joke #" + joke3 + ". " + Dadjoke[joke3] + ".");
				
				//just filler space
				System.out.println("");
				
				
				//plus 4 to the joke counter; program has told 4 of it's jokes
				JokeCounter = JokeCounter + 4;
				
				//Tell them how many dad jokes have been told
				System.out.println("You have just been told a total of " + JokeCounter + " Dad jokes.");
				
				//filler space
				System.out.println("");
				
				// Ask them if the user wants more dad jokes
				System.out.println("Would you like to hear more Dad jokes?");						
				}
			
				else
				{
				//End the jokes
				System.out.println("Okay, no more dad jokes. Thanks for reading.");
				System.out.println("You could only handle " + JokeCounter + " Dad jokes.");
				
				//More jokes = false closes the loop
				MoreJokes = false;
				
				//Close the scanner
				scanner.close();	
				}
			}		
}
}