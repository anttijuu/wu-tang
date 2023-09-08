package oy.interact.tira;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

@DisplayName("Tests for WuTangGenerator")
public class WuTangGeneratorTests 
{
    private Programmer [] programmers;

    @RepeatedTest(20)
    @DisplayName("Tests for WuTangGenerator.generateNamesFor")
    public void testWuTangGenerator()
    {
        String[] names = {
            "Antti J",
            "Jouni L",
            "Joni R",
            "Kristian H",
            "Netta I",
            "Marianne K",
            "Markku O",
            "Harri O-K",
            "Jouko N",
            "Tim C",
            "Bill G",
            "Sauli N",
            "Heppu H"
        };
        assertDoesNotThrow(
            () -> programmers = WuTangGenerator.generateNamesFor(names), 
            "Name generator must not throw"
        );
        assertEquals(
            names.length, 
            programmers.length, 
            "Names and programmer names counts do not match"
        );
        int programmerCount = 0;
        int wuTangNameCount = 0;
        for (Programmer programmer : programmers) {
            if (null != programmer) {
                programmerCount++;
                if (null != programmer.getWuTangName()) {
                    wuTangNameCount++;
                }
            }
        }
        assertEquals(
            names.length,
            programmerCount, 
            "Did not generate enough programmers"
        );
        assertEquals(
            names.length, 
            wuTangNameCount, 
            "Did not generate enough programmer names"
        );
    }

    @RepeatedTest(20)
    @DisplayName("Tests for WuTangGenerator.generateNamesFor with too much names")
    public void testWuTangGeneratorThrows() {
        final String [] names = getStringArray(WuTangGenerator.getMaxNameCount() + 10);
        assertThrows(
            IllegalArgumentException.class, 
            () -> programmers = WuTangGenerator.generateNamesFor(names), 
            "Name generator must throw if too much names"
        );
    }

    private String[] getStringArray(int size) {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        final Random random = new Random();
  
        String[] array = new String[size];
  
        for (int i = 0; i < size; i++) {
           String generatedString = random.ints(leftLimit, rightLimit + 1)
                 .filter(number -> (number <= 57 || number >= 65) && (number <= 90 || number >= 97))
                 .limit(targetStringLength)
                 .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                 .toString();
           array[i] = generatedString;
        }
        return array;
    }
  
}
