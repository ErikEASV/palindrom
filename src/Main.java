// Eksempel på check af om en streng er et palindrom.
// EK 27.okt. 2022

public class Main {

    public static void main(String[] args) {

        // Eksempler på palindromer til afprøvning:
        String s0 = "otto";
        String s1 = "en af dem der red med fane";
        String s2 = "selmas lakserøde garagedøre skal samles";
        String s3 = "lås oksemaden ned og giv viggo denne dameskosål";

        // Check om en given streng er et palindrom
        System.out.println(palindrom(s3));
    }

    // Palindrom returnerer sand, hvis parameteren er et palindrom
    // og falsk, hvis det ikke er et palindrom.
    static boolean palindrom(String t) {
        // skriv pænt ud, hvordan palindromet ser ud inden vi checker det
        System.out.println(" ".repeat(30-t.length()/2) + t);
        // fjern blanktegn først og sidst
        t = t.trim();

        // her sker det spændende:
        // Hvis strengen kun er på eet tegn er det et palindrom
        if (t.length() <= 1)
            return true;
        else
            // Det er et palindrom, hvis første og sidste tegn er ens
            // og midterdelen også er et palindrom.
            if (t.charAt(0) == t.charAt(t.length()-1) )
                return palindrom(t.substring(1, t.length()-1));
            else
                return false;
    }
}