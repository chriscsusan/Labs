/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
package Examples;

public class Student {

	public static final String HOMETOWN = "hometown";
	public static final String FAVORITE_FOOD = "favorite food";

	private String name;
	private String favoriteFood;
	private String hometown;

	public Student(String name, String favoriteFood, String hometown) {
		this.name = name;
		this.favoriteFood = favoriteFood;
		this.hometown = hometown;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getInformation(String infoType) throws IllegalArgumentException {
		if (FAVORITE_FOOD.equalsIgnoreCase(infoType)) {
			return getFavoriteFood();
		} else if (HOMETOWN.equalsIgnoreCase(infoType)) {
			return getHometown();
		} else {
			throw new IllegalArgumentException("Invalid student information type:" + infoType);
		}
	}

}

