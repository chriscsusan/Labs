package labs;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 1. Download http://search.maven.org/remotecontent?filepath=junit/junit/4.12/junit-4.12.jar
 * 2. Drag the JAR file into your project
 * 3. Right-click the JAR in Eclipse. Select "Build Path", "Add to Build Path".
 * 4. Repeat steps 1 through 4 for http://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
 */
public class Lab6Test {

	// If starts with vowel, "way" is added
	@Test
	public void testStartsWithVowel() {
		String translation = Lab6.translateWord("echo");
		assertEquals("echoway", translation);
	}

	// If starts with 1 consonant, move to end and add "ay"
	@Test
	public void testStartsWith1Consonant() {
		String translation = Lab6.translateWord("pineapple");
		assertEquals("ineapplepay", translation);
	}

	// If starts with multiple consonants, move to end and add "ay"
	@Test
	public void testStartsWithMultipleConsonants() {
		String translation = Lab6.translateWord("whence");
		assertEquals("encewhay", translation);
	}

	// Words are converted to lower case
	@Test
	public void testConvertedToLowerCase() {
		String translation = Lab6.translateWord("AnD");
		assertEquals("andway", translation);
	}

	// y is a consonant
	@Test
	public void testYIsConsonant() {
		String translation = Lab6.translateWord("yes");
		assertEquals("esyay", translation);
	}

}

