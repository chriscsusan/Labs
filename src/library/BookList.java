package library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BookList {
	
	private static Path filePath = Paths.get("C:/Users/Administrator/workspace/Labs/src/library/books.txt");
	private static  List<Book> bookList = new ArrayList<>();
	
	public BookList(){
		
	}
	
	public static List<Book> getBooks(){
		
		try {
			File file = filePath.toFile();
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = reader.readLine();
			String[] parts;
			while (line != null) {
				parts = line.split("\t");
				bookList.add(new Book(parts[0], parts[1]));
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException ex) {
			throw new RuntimeException("");
		}
		return bookList;
	}

}
