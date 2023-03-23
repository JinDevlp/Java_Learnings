public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 70;
        int englishGrade = 65;
        String language = "Java";

        if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")){
            System.out.println("You get a scholarship");
        } else {
            System.out.println("You don't qualify for a scholarship");
        }

        int credits = 56;
        double GPA = 1.2;

        if (credits >= 40 && GPA >= 2.0) {
            System.out.println("You earned your diploma");
        } else{
            System.out.println("You did not earn your diploma. you need at least 40 credits and minimum of 2.0 GPA");
        }
    }
}
