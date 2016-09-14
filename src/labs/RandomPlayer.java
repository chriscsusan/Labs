package labs;

import java.util.Random;

public class RandomPlayer extends Player{
	Random rdm = new Random();
	int temp=0;
	
	public RandomPlayer(String name){
		super(name);
	}
	
	@Override
	public Roshambo generateRoshambo(){
		temp = rdm.nextInt(3);
		if(temp == 0){
			return Roshambo.PAPER;
		}else if (temp == 1){
			return Roshambo.ROCK;
		}else if(temp ==2){
			return Roshambo.SCISSORS;
		}else{
			System.out.println("Something went wrong.");
		}
		return null;
	}
	

}


