package library;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import countriesLab.CountriesTextFile;


public class LibraryApp {
	


	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		Calendar c = new GregorianCalendar();	
		Date currentDate = c.getTime();
		c.add(Calendar.DATE, 14);
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		Date nextDate = c.getTime();
		String dueDate = format.format(nextDate);		
		
		
		int choice = 0;
		String keepGoing = "y";
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the library!");
		bookList = BookList.getBooks();
		while (keepGoing.equalsIgnoreCase("y")) {
			
			try {
				System.out.println("\n1-See the list of books");
				System.out.println("2-Search by author");
				System.out.println("3-Search by keyword");
				System.out.println("4-Select by title");
				System.out.println("5-Return a book");
				try{
				choice = sc.nextInt();
				}catch(InputMismatchException ex){
					System.out.println("You must choose a number from 1-3.");
					sc.nextLine();
					continue;
				}
				switch (choice) {
				case 1:
					for (Book s : bookList) {
						System.out.println("\"" + s.getTitle() + "\"\n\t by: " + s.getAuthor());
					}
					break;
				case 2:
					System.out.println("Enter author:");
					sc.nextLine();
					
					List<String> authors = new ArrayList<>();
					String author = sc.nextLine().toLowerCase();
					for (Book b : bookList) {
						if (b.getAuthor().toLowerCase().contains(author)) {
							System.out.println("\"" + b.getTitle() + "\"\n\t by: " + b.getAuthor());;

						}
					}
					break;
				case 3:
					System.out.println("Enter keyword from the title:");
					sc.nextLine();
					String keyword = sc.nextLine().toLowerCase();
					for (Book b : bookList) {
						if (b.getTitle().toLowerCase().contains(keyword)) {
							System.out.println("\"" + b.getTitle() + "\"\n\t by: " + b.getAuthor());;

						}
					}
					break;
				case 4:
					String title = "";
					System.out.println("Enter title of book:");
					sc.nextLine();
					title = sc.nextLine().toLowerCase();
					System.out.println(getBook(title, bookList).getTitle());
					
					break;
				case 5:
					
					break;
				default:
					System.out.println("That is not a valid menu option.");
					continue;
				}
			} catch (RuntimeException ex) {
				System.out.println(ex.getMessage());
				continue;
			}

		}

	}
	
	public static Book getBook(String title, List<Book> bookList){
		for (Book b:bookList){
			if(b.getTitle().toLowerCase().equals(title)){
				return b;
			}
		}
		System.out.println("Title not found.");
		return null;
	}

}
