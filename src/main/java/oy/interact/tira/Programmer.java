package oy.interact.tira;

public class Programmer {
	private String name;
	private String programmerName;

	public Programmer(String name, String programmerName) {
		this.name = name;
		this.programmerName = programmerName;
	}

	public String getName() {
		return name;
	}

	public String getProgrammerName() {
		return programmerName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(name);
		builder.append(" a.k.a. ");
		builder.append(programmerName);
		return builder.toString();
	}
}
