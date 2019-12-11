/** Guess the number
* Version 1.1 
* Author Liarra Sims */

/**This game requires repeated input. Please use a complier such as netbeans to play the game fully!*/

/** Please enter a number between 1-100. The game has picked a number at random. The goal is to guess the number correctly. It will give you hints as you get closer or further from the random number*/


import java.util.Random;
import java.lang.Math.*;
import java.util.Scanner;

public class Program
{
	private int ranNum;
	private int input;
	private boolean gameOn;
	private boolean win;
	
	 
	//Zero Argument Constructor
	public Program(){
		ranNum = 0;
		gameOn = true;
	}
	//Get method for Random Number
	public int getRanNum(){
		return this.ranNum;
	}
	//Generates and sets Random Number
	public void setRanNum(){
		Random r = new Random();
		this.ranNum =r.nextInt(100);
	}
	//User input get method
	public int getInput(){
		return this.input;
	}
	//User input set method
	public void setInput(int i){
		this.input = i;
	}
	
	//GameOn get method
	public boolean getGame(){
		return this.gameOn;
	}
	
	//GameOn set method
	public void setGame(boolean i){
		this.gameOn = i;
	}
	
	//get method for win
	public boolean getWin(){
		return this.win;
	}
	
	//sets win using the guessCorrect method
	public void setWin(){
		this.win = guessCorrect();
	}
	
	
	
	
	//Determines whether user input is greater than random number
	public boolean greaterThan(){
		return this.getInput() > this.getRanNum();
	
}
	//Determines whether guess is within 10 of the random number
	public boolean inRange(){
		int t = this.getInput() - this.getRanNum();
		int v = Math.abs(t);
		return v < 10;
}

	//Determines if the guess is correct
	public boolean guessCorrect(){
		return this.getInput() == this.getRanNum();
}

	//Grabs a user input and stores it
	public void ask(){
		Scanner obj = new Scanner(System.in);
		boolean w = true;
		int holder;
		while(w == true){
			System.out.println("Please enter a number: ");
			holder = obj.nextInt();
			if(holder > 100 || holder < 0){
				System.out.print("Enter a number between 0 and 100");
}
			else{
				this.setInput(holder);
				w = false;
			}
	}
	}
	
	//Sets the number and asks for isers guess
	public void runGame(){
		this.setRanNum();
		this.ask();
	}
	

	public void howClose(){
		if (greaterThan() & inRange()){
			System.out.println("You number is larger than mine but its close!");
}
		else if(greaterThan()){
			System.out.println("Your number is too big!");
		}
		else if(inRange()){
			System.out.println("You number is too small but it is close!");
}
		else{
			System.out.println("Your number is too small!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		Program aGame = new Program();

//Grab random number and user input
		aGame.runGame();
		
		while(aGame.getGame() == true){//While the game is not won

//check user input for win
			aGame.setWin();
			
			if(aGame.getWin()== false){//Check how close and ask for new number
				aGame.howClose();
				aGame.ask();
}
			else{//Game won
				aGame.setGame(false);
				System.out.println("Correct! My number was " + aGame.getRanNum() + ".");
				
			}
	}
	}
}
