package oy.interact.tira;

import java.util.concurrent.ThreadLocalRandom;

public class WuTangNameGenerator {

	private static final String[] firstNames = {
			"Hex",
			"⦶ctal",
			"Bōōlean",
			"Linεar",
			"$tatic",
			"Global",
			"∧bstract",
			"∫inal",
			"0verridden",
			"Private",
			"ℙrotected",
			"Parallel",
			"Ⓒ orrupt",
			"Infinite∞",
			"Ðisconnected",
			"R∀ndom",
			"Quadrati⪽",
			"Ïnvariant"
	};
	private static final String[] lastNames = {
			"∑tack",
			"Ĥeap",
			"L➿p",
			"Re¢ursion",
			"Øverflow",
			"3reakpoint",
			"Warning",
			"1nstance",
			"De🪳 ger",
			"βyte",
			"Package",
			"Terminal",
			"Thread",
			"Process",
			"Packet",
			"Mütex",
			"Compiler",
			"Rege𝒳",
			"⨃nderflow"
	};

	public static int possibleCombinations() {
		return firstNames.length * lastNames.length;
	}

	public static Programmer[] generateNames(final String[] realNames) {
		Programmer[] programmers = new Programmer[realNames.length];
		int generatedCount = 0;
		for (String name : realNames) {
			String programmerName = generateRandomName();
			if (isUnique(programmerName, programmers)) {
				programmers[generatedCount++] = new Programmer(name, programmerName);
			}
			// while (!isUnique(programmerName, programmers)) {
			// programmerName = generateRandomName();
			// }
			// programmers[generatedCount++] = new Programmer(name, programmerName);
		}
		return programmers;
	}

	private static String generateRandomName() {
		StringBuilder builder = new StringBuilder();
		int index = ThreadLocalRandom.current().nextInt(firstNames.length);
		builder.append(firstNames[index]);
		builder.append(" ");
		index = ThreadLocalRandom.current().nextInt(lastNames.length);
		builder.append(lastNames[index]);
		return builder.toString();
	}

	private static boolean isUnique(final String name, final Programmer[] inProgrammers) {
		for (int index = 0; index < inProgrammers.length; index++) {
			if (inProgrammers[index] != null) {
				if (inProgrammers[index].getProgrammerName().equals(name)) {
					return false;
				}
			} else {
				break;
			}
			if (inProgrammers[index].getWuTangName().equals(name)) {
				return false;
			}
		}
		return true;
	}

}
