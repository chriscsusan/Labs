import java.util.Scanner;

public class Lab6 { 
 

 	public static void main(String[] args) {  
		Scanner scanner = new Scanner(System.in);
		String repeat = "y";
		
		System.out.println("Welcome to the Pig Latin Translator!");

		
		while (repeat.equalsIgnoreCase("y")){
			System.out.println("Enter a line to be translated:");
			String toBeTranslated = scanner.next();
			translateWord(toBeTranslated);
			System.out.println("Translate another? (y/n)");
			repeat = scanner.next();
		}
		scanner.close();
 	} 
 

 	/** 
 	 * This method takes any single English word and translates it to a Pig Latin word. 
 	 */ 
 	public static String translateWord(String englishWord) { 
 		String latinWord = "";
 		String lowerCase = englishWord.toLowerCase();
 		System.out.println(lowerCase);
 		if (isFirstAVowel(lowerCase)){
 			latinWord = lowerCase + "way";
 		} else{
 				latinWord = moveLetters(lowerCase);
 		}
 		System.out.println(latinWord);
 		return latinWord; 
 	} 
 	
 	
 	public static boolean isFirstAVowel(String lowerCase){
 		boolean isItAVowel;
 		if (lowerCase.startsWith("a") || lowerCase.startsWith("e") || lowerCase.startsWith("i") || lowerCase.startsWith("o") || lowerCase.startsWith("u")){
 	 		isItAVowel = true;
 		}else {
 			isItAVowel = false;
 		}
 		return isItAVowel;
 	}
 	
 	
 	
 	public static String moveLetters(String englishWord){
 		int firstVowel=0;
 		for(int i=0; i < englishWord.length(); i++){
 			if(englishWord.charAt(i) == 'a' || englishWord.charAt(i) == 'e' || englishWord.charAt(i) == 'i' || englishWord.charAt(i) == 'o' || englishWord.charAt(i) == 'u'){
 				firstVowel = i;
 				break;
 			}
 		}
 		String toBeMoved = englishWord.substring(0, firstVowel);
 		String newBeginning = englishWord.substring(firstVowel);
 		englishWord = newBeginning + toBeMoved + "ay";
 		return englishWord;
 	}
 
 } 
