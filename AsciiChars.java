package controlFlow;

public class AsciiChars {
    public static void printNumbers() {
        // TODO: print valid numeric input
        // find valid values and print it basically, use ascii values
        //48 - 57
        for(int i=48; i<58; i++) {
            char c = (char)i;
            System.out.println(c);
        }
    }

    public static void printLowerCase() {
        // TODO: print valid lowercase alphabetic input
        //97 - 122
        for(int i=97; i<123; i++) {
            char c = (char)i;
            System.out.println(c);
        }
    }

    public static void printUpperCase() {
        // TODO: print valid uppercase alphabetic input
        //65 - 90
        for(int i=65; i<91; i++) {
            char c = (char)i;
            System.out.println(c);
        }
    }
}
