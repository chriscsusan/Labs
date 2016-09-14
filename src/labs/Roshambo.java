package labs;

public enum Roshambo {
	ROCK,
	PAPER,
	SCISSORS;
	
	public String toString(){
		switch (this){
		case ROCK:
			return "rock";
		case PAPER:
			return "paper";
		case SCISSORS:
			return "scissors";
		}
		return "Other";
		
	}
	
}
