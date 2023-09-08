package oy.interact.tira;

/**
 * Hello world!
 *
 */
public class WuTangGeneratorApp {
    public static void main(String[] args) {
        try {
            new WuTangGeneratorApp().run();
        } catch (Exception e) {
            System.out.format("ERROR: Failed because %s%n", e.getMessage());
        }
    }

    private void run() {

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

        System.out.println("Wu-Tang name generator for programmers");
        System.out.println("--------------------------------------");
        System.out.format("- The generator can produce %d unique names%n",
                WuTangGenerator.getMaxNameCount());
        Programmer[] programmers = WuTangGenerator.generateNamesFor(names);
        System.out.format("Names: %d%n", names.length);
        System.out.format("Programmers: %d%n", programmers.length);
        int counter = 1;
        for (Programmer programmer : programmers) {
            if (null != programmer) {
                System.out.format("%3d. %-20s a.k.a %s%n",
                        counter++,
                        programmer.getName(),
                        programmer.getWuTangName());
            } else {
                System.out.println("NULL IN PROGRAMMERS ARRAY");
            }
        }
    }
}
