package labs;

import java.util.Random;

public class RandomPlayer extends Player{
	Random rdm = new Random();
	int temp=0;
	Roshambo result;
	
	@Override
	public Roshambo generateRoshambo(){
		temp = rdm.nextInt(3);
		if(temp == 0){
			result = Roshambo.PAPER;
		}else if (temp == 1){
			result = Roshambo.ROCK;
		}else if(temp ==2){
			result = Roshambo.SCISSORS;
		}else{
			System.out.println("Something went wrong.");
		}
		return result;
	}
	

}


