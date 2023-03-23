public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        // Add if-else statement here
        if (biologyGrade > chemistryGrade) {
            System.out.println("Yes, congrats!");
        } else {
            System.out.println("No, work harder");
        }

        int grade = 49;

        if (grade >= 80){
            System.out.println("You got an A");
        } else if (grade >= 70){
            System.out.println("You got a B");
        }else if (grade >= 60){
            System.out.println("You got a C");
        }else if (grade >= 50){
            System.out.println("You got a D");
        }else {
            System.out.println("You failed");
        }

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        // Add if-else statement here
        if (sales > costs) {
            System.out.println("yes. you made profit");
        } else {
            System.out.println("No, you lost money");
        }

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        // Add if-else statement here
        if (temperature < targetTemperature) {
            System.out.println("Yes temperature is colder than our target");
        } else {
            System.out.println("No temperature is warmer");
        }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        // Add if-else statement here
        if (currentSpeed < speedLimit) {
            System.out.println("Yes, you are driving slower than the speed limit");
        } else {
            System.out.println("No you should slow down");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        // Add if-else statement here
        if (age >= retirementAge){
            System.out.println("yes you can retired");
        } else {
            System.out.println("No you are not old enough");
        }

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        // Add if-else statement here
        if (myGrade == bestGrade) {
            System.out.println("Yes you got an A");
        } else {
            System.out.println("No you did not get an A");
        }

        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        // Add if-else statement here
        if (word.equals(secondWord)) {
            System.out.println("yes same word");
        } else {
            System.out.println("No different wor");
        }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");
        // Add if-else statement here
        if (!thirdWord.equals(fourthWord)){
            System.out.println("Yes different");
        } else {
            System.out.println("No same");
        }
    }
}
