package oy.interact.tira;

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
        final String [] students = {"Kevin B", "Antti J", "Kristian H.", "Joni R", "Jouni L", "Mikko R", "Päivi R", "Pertti K", "Juha I", "Markku O", "Netta I", "Harrri O-K"};
        Programmer [] programmers = generator.generateNames(students);
        if (null != programmers) {
            int counter = 1;
            for (Programmer programmer : programmers) {
                System.out.format("%3d. %-15s a.k.a. %s%n", counter++, programmer.getName(), programmer.getProgrammerName());
            }
        } else {
            System.out.println("*** ERROR: Generator did not generate any programmers.");
        }
    }

}
