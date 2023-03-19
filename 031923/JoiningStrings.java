// stores text
// DOUBLE QUOTES for string

public class JoiningStrings {
    public static void main(String[] args) {
        int year = 2023;
        int month = 3;
        int date = 18;
        String language = "Java";
        String announcement = "Beginning on " + month + "/" + date + "/" + year + " I started learning " + language;
        System.out.println(announcement);
    }
}
