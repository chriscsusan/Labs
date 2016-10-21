/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
package LabA;

/**
 * Responsibility: Hold information about any ONE movie.
 */
public class Movie {
	private Integer id;
	private String title;
	private String category;
	private String description;
	private Integer year;
	private String rating;
	private String origin;
	private String[] ratings = {"G", "PG", "PG13", "R"};
	private String[] origins = {"Hollywood", "Foreign", "Independent"};
	private boolean blackAndWhite;
	
	
	public Movie() {
	}

	// Constructor
	public Movie (String t, String c) {
		title = t;
		category = c;
	}
	
	public Movie (String t, String c, String d, Integer y, boolean bAw, String r, String o) {
		title = t;
		category = c;
		description = d;
		year = y;
		blackAndWhite=bAw;
		rating = r;
		origin = o;
	}
	
	public String getRating(){
		return rating;
	}
	public void setRating(String rating){
		this.rating=rating;
	}
	
	public String getRatings(int i){
		return ratings[i];
	}
	
	public String getOrigins(int i){
		return origins[i];
	}
	
	public void setOrigin (String origin){
		this.origin=origin;
	}
	
	public String getOrigin(){
		return this.origin;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setYear(Integer year){
		this.year=year;
	}
	
	public Integer getYear(){
		return year;
	}

	// getter
	public String getTitle() {
		return title;
	}
	
	// getter
	public String getCategory() {
		return category;
	}
	
	// setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	// setter
	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + "]";
	}
	public void setDescription(String description){
		this.description=description;
	}
	
	public String getDescription(){
		return description;
	}

	public boolean getBlackAndWhite(){
		return blackAndWhite;
	}
	public void setBlackAndWhite(boolean bAw){
		this.blackAndWhite=true;
	}
}
