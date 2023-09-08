package oy.interact.tira;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

@DisplayName("Tests the WuTangNameGenerator class")
public class GeneratorTests {

	private static final String[] someNames = {
		"Kevin B",
		"Antti J",
		"Kristian H",
		"Joni R",
		"Jouni L",
		"Mikko R",
		"Päivi R",
		"Pertti K",
		"Juha I",
		"Markku O",
		"Netta I",
		"Harri O-K",
		"Tim C",
		"Bill G"
	};

	private Programmer [] testProgrammers = null;

	@RepeatedTest(10)
	@DisplayName("Tests the correctness of the WuTangNameGenerator.generateNames")
	void testGeneratorResults() {
		
		assertDoesNotThrow(() -> testProgrammers = WuTangNameGenerator.generateNames(someNames), "generateNames must now throw");
		assertEquals(someNames.length, testProgrammers.length, "Generated array length must equal source name array length");
		int counter = 0;
		int wuTanCounter = 0;
		for (Programmer programmer : testProgrammers) {
			if (null != programmer) {
				counter++;
				if (null != programmer.getProgrammerName()) {
					wuTanCounter++;
				}
			}
		}
		assertEquals(counter, someNames.length, "Generated array must have a programmer for every name");
		assertEquals(wuTanCounter, someNames.length, "Generated array must have a programmer wu tang name for every name");
	}

}
