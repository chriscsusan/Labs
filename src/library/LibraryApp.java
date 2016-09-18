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
		String answer = "";

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
				System.out.println("6-Exit");
				try {
					choice = sc.nextInt();
				} catch (InputMismatchException ex) {
					System.out.println("You must choose a number from 1-6.");
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
							System.out.println("\"" + b.getTitle() + "\"\n\t by: " + b.getAuthor());
							;

						}
					}
					break;
				case 3:
					System.out.println("Enter keyword from the title:");
					sc.nextLine();
					String keyword = sc.nextLine().toLowerCase();
					for (Book b : bookList) {
						if (b.getTitle().toLowerCase().contains(keyword)) {
							System.out.println("\"" + b.getTitle() + "\"\n\t by: " + b.getAuthor());
							;

						}
					}
					break;
				case 4:
					String title = "";
					System.out.println("Enter title of book:");
					sc.nextLine();
					title = sc.nextLine().toLowerCase();
					System.out.println(getBook(title, bookList).getStatus().toString());
					Status status = getBook(title, bookList).getStatus();
					switch (status) {
					case ON_SHELF:
						System.out.println("Would you like to check out this book?");
						break;
					case RETURNED:
						System.out.println("Do you want someone to find this book so you can check it out?");
						break;
					case CHECKED_OUT:
						System.out.println("This book is due back on " + "" + ".  Please come after that to check it out.");
						break;
					case ON_ORDER:
						System.out.println("It is set to arrive on " + "" + ".\nPlease come back then to check it out.");
						break;
					default: 
						
					}

					break;
				case 5:

					break;
				case 6:
					System.out.println("Thanks for using our online catalog system.  Have a nice day.");
					keepGoing = "n";
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

	public static Book getBook(String title, List<Book> bookList) {
		for (Book b : bookList) {
			if (b.getTitle().toLowerCase().equals(title)) {
				return b;
			}
		}
		System.out.println("Title not found.");
		return null;
	}

}
