package countriesLab;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountriesTextFile {

	private static Path filePath = Paths.get("C:/Users/Administrator/workspace/Labs/src/countriesLab/countries.txt");
	private static List<String> countries = new ArrayList<String>();

	public static void setCountry(String countryName) {
		try {
			File file = filePath.toFile();
			FileWriter fileWriter = new FileWriter(file, true);
			PrintWriter printWriter = new PrintWriter(new BufferedWriter(fileWriter));

			printWriter.println(countryName);
			printWriter.flush();
			fileWriter.close();
			printWriter.close();
		} catch (IOException ex) {
			throw new RuntimeException("Something went wrong in setCountry.");
		}
	}

	public static List<String> getCountry() {

		try {
			File file = filePath.toFile();
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = reader.readLine();
			while (line != null) {
				countries.add(line);
				line = reader.readLine();
			}
			reader.close();
			fileReader.close();
		} catch (IOException ex) {
			throw new RuntimeException("");
		}
		
		
		return countries;
	}

	public static void checkForFile() {
		if (Files.exists(filePath)) {
			return;
		}
		File file = new File("C:/Users/Administrator/workspace/Labs/src/countriesLab/countries.txt");
		try {
			file.createNewFile();
			System.out.println("File didn't exist and was created.");

		} catch (IOException ex) {
			throw new RuntimeException("Something went wrong in checkForFile.");
		}
	}
}
