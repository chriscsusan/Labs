package labs;

public class Player {

	private String name;
	int wins = 0;
	int losses = 0;
	int ties = 0;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Roshambo generateRoshambo(){
		
		return Roshambo.ROCK;
	}
}
