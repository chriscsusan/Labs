package movielab2;
public class Movie {
	private String title;
	private String category;
	
	public Movie (String t, String c) {
		title = t;
		category = c;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}

