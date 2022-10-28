public class Main {

    public static void main(String[] args) {

        String s0 = "otto";
        String s1 = "en af dem der red med fane";
        String s2 = "selmas lakserøde garagedøre skal samles";
        String s3 = "lås oksemaden nedx og giv viggo denne dameskosål";

        System.out.println(palindrom(s3));
    }

    static boolean palindrom(String t) {
        System.out.println(" ".repeat(30-t.length()/2) + t);
        t = t.trim();

        if (t.length() <= 1)
            return true;
        else
        if (t.charAt(0) == t.charAt(t.length()-1) )
            return palindrom(t.substring(1,t.length()-1));
        else
            return false;
    }
}