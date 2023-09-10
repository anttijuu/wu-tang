package oy.interact.tira;

import java.util.concurrent.ThreadLocalRandom;

public class WuTangGenerator {

	private WuTangGenerator() {
		// Prevents instantiation.
	}
	
	private static final String [] firstNames = {
		"Abstract",
		"Random",
		"Octal",
		"Hex",
		"Invariant",
		"Private",
		"Protected",
		"Public",
		"Static",
		"Parallel",
		"Infinite"
	};

	private static final String [] secondNames = {
		"Underflow",
		"Overflow",
		"Bit",
		"Byte",
		"Word",
		"Nibble",
		"Stack",
		"Heap",
		"Thread",
		"Process"
	};

	public static int getMaxNameCount() {
		return firstNames.length * secondNames.length;
	}

	public static Programmer[] generateNamesFor(final String [] names) {
		if (names.length > getMaxNameCount()) {
			throw new IllegalArgumentException("Cannot generate so much names");
		}
		Programmer [] programmers = new Programmer[names.length];
		int index = 0;
		for (String name : names) {
			String programmerName = generateName();
			while (!isUnique(programmerName, programmers)) {
				programmerName = generateName();
			}
			programmers[index++] = new Programmer(name, programmerName);
		}
		return programmers;
	}

	private static boolean isUnique(final String programmerName, final Programmer [] programmers) {
		for (Programmer programmer : programmers) {
			if (null != programmer) {
				if (programmer.getWuTangName().equals(programmerName)) {
					return false;
				}
			} else {
				break;
			}
		}
		return true;
	}

	private static String generateName() {
		StringBuilder builder = new StringBuilder();
		int index = ThreadLocalRandom.current().nextInt(firstNames.length);
		builder.append(firstNames[index]);
		builder.append(" ");
		index = ThreadLocalRandom.current().nextInt(secondNames.length);
		builder.append(secondNames[index]);
		return builder.toString();
	}

}
