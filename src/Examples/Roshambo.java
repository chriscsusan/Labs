package Examples;

public enum Roshambo {
	
	ROCK,
	PAPER,
	SCISSORS;
	
	@Override
	public String toString(){
		String roshamboString = "";
		if (ordinal() == 0){
			roshamboString = "Rock";
		}
		else if (this.ordinal() == 1){
			roshamboString = "Paper";
		}
		else if (this.ordinal() == 2){
			roshamboString = "Scissors";
		}
		return roshamboString;
	}

}