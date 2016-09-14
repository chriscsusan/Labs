package Examples;

public class RockPlayer extends Player{
	
	public RockPlayer(String playerName) {
		super(playerName);
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}