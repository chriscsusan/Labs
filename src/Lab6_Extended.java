import java.util.Scanner;

public class Lab6_Extended {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String repeat = "y";

		System.out.println("Welcome to the Pig Latin Translator!");

		while (repeat.equalsIgnoreCase("y")) {
			System.out.println("Enter a line to be translated:");
			String toBeTranslated = scanner.nextLine();
			System.out.println(translatePhrase(toBeTranslated));
			System.out.println("Translate another? (y/n)");
			repeat = scanner.next();
		}
		scanner.close();
	}

	public static String translatePhrase(String englishWord){
		String latinPhrase = "";
		String currentWord="";
		String tempPhrase = englishWord;
		while (!tempPhrase.equals("")){
			currentWord = tempPhrase.substring(0,tempPhrase.indexOf(32));
			tempPhrase = tempPhrase.substring(tempPhrase.indexOf(32)+1);
			latinPhrase = latinPhrase + translateWord(currentWord)+" ";	
			if (tempPhrase.indexOf(32) == tempPhrase.lastIndexOf(32)){
				currentWord = tempPhrase.substring(0,tempPhrase.indexOf(32));
				tempPhrase = tempPhrase.substring(tempPhrase.indexOf(32)+1);
				latinPhrase = latinPhrase + translateWord(currentWord)+" ";	
				currentWord = tempPhrase;
				latinPhrase = latinPhrase + translateWord(currentWord);	
				break;
			}else{
				;
			}
			
		}
		
		
		
		return latinPhrase;
	}
	/**
	 * This method takes any single English word and translates it to a Pig
	 * Latin word.
	 */
	public static String translateWord(String englishWord) {
		String latinWord = "";
		boolean firstUpper = checkCase(englishWord);
		boolean allUpper = checkWordCase(englishWord);
		englishWord = englishWord.toLowerCase();
		if (isFirstAVowel(englishWord)) {
			latinWord = englishWord + "way";
		} else {
			latinWord = moveLetters(englishWord);
		}
		latinWord = caseChecker(firstUpper, allUpper, latinWord);
		
		

		return latinWord;
	}

	public static String punctChecker(String latinWord){
		int firstSet;
		int secondSet;
		int thirdSet;
		
		for (int i=0; i<latinWord.length(); i++){
			if (latinWord.charAt(i) >= 33 && latinWord.charAt(i) <= 47){
				firstSet = i;
			}else if(latinWord.charAt(i) >= 91 && latinWord.charAt(i) <= 93){
				secondSet = i;
			}else if(latinWord.charAt(i) >= 123 && latinWord.charAt(i) <=125){
				thirdSet = i;
			}
		
		}
		
		return latinWord;
	}
	public static String caseChecker(boolean firstUpper, boolean allUpper, String latinWord) {
		
		if (allUpper) {
			latinWord = latinWord.toUpperCase();
		} else if (firstUpper) {
			String firstLetter = latinWord.substring(0, 1);
			firstLetter = firstLetter.toUpperCase();
			latinWord = (firstLetter + latinWord.substring(1, latinWord.length()));
		}
		return latinWord;
	}

	public static boolean isFirstAVowel(String englishWord) {
		boolean isItAVowel;
		String lowerCase = englishWord.toLowerCase();
		if (lowerCase.startsWith("a") || lowerCase.startsWith("e") || lowerCase.startsWith("i")
				|| lowerCase.startsWith("o") || lowerCase.startsWith("u")) {
			isItAVowel = true;
		} else {
			isItAVowel = false;
		}
		return isItAVowel;
	}

	public static String moveLetters(String englishWord) {
		int firstVowel = 0;
		for (int i = 0; i < englishWord.length(); i++) {
			if (englishWord.charAt(i) == 'a' || englishWord.charAt(i) == 'e' || englishWord.charAt(i) == 'i'
					|| englishWord.charAt(i) == 'o' || englishWord.charAt(i) == 'u') {
				firstVowel = i;
				break;
			}
		}
		String toBeMoved = englishWord.substring(0, firstVowel);
		String newBeginning = englishWord.substring(firstVowel);
		englishWord = newBeginning + toBeMoved + "ay";
		return englishWord;
	}

	public static boolean checkCase(String input) {
		boolean output = input.charAt(0) >= 'A' && input.charAt(0) <= 'Z';
		return output;
	}

	public static boolean checkWordCase(String input) {
		boolean output = true;

		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {

			} else {
				output = false;
			}
		}
		return output;
	}

}
