package labs;

public class AlwaysRock extends Player {

	public AlwaysRock(String name){
		super(name);
	}
	
	@Override
	public Roshambo generateRoshambo(){
		return Roshambo.ROCK;
	}
}
