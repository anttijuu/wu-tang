package oy.interact;

/**
 * Wu-Tang name generator.
 * Inspired by https://www.youtube.com/watch?v=nDeHQL6liSI
 */
public class WuTangNamesApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Wu-Tang name generator for programmers");
        System.out.println( "--------------------------------------");
        WuTangNameGenerator generator = new WuTangNameGenerator();
        System.out.format("- The generator can produce %d unique names%n", generator.possibleCombinations());
        final String [] students = {"Juha I", "Antti J", "Heli A", "Priyanka S", "Behnaz N", "Joni R", "Jouni L", "Mikko R", "Päivi R", "Pertti K", "Marianne K", "Netta I", "Karin V"};
        Programmer [] programmers = generator.generateNames(students);
        int counter = 1;
        for (Programmer programmer : programmers) {
            System.out.format("%3d. %15s a.k.a. %s%n", counter++, programmer.getName(), programmer.getProgrammerName());
        }
    }

}
