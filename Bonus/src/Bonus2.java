import com.teamtreehouse.KaraokeMachine; 
import com.teamtreehouse.model.Song; 
import com.teamtreehouse.model.SongBook; 

public class Bonus2 {
	  public static void main(String[] args) { 
		  SongBook songBook = SongBook(); 
		  KaraokeMachine machine = KaraokeMachine(songBook); 
		  machine.run(); 
		  } 

}
