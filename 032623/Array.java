public class Array {
    public static void main(String[] args) {
//        While loop
//        int i = 3;
//
//        while (i <10 ) {
//            System.out.println("10 is bigger than "+ i);
//            i++;
//        }

//        do-while loop
//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i<5);

//        For loops
//        for(statement1; statement2;statement3){
//            Statement 1 is executed (one time) before the execution of the code block
//            Statement 2 defines the condition for executing the code block
//            Statement 3 is executed (everytime) after the code block has been executed
//        }
//        for(int i = 0; i < 5; i++){
//            System.out.println(i);
//        }

//      Break & Continue
//        for (int i =0; i < 10; i++){
//
//            if (i == 4){
//                break;
//                continue;
//            }
//            System.out.println((i));
//        }

//        Arrays
        String[] cars = {"BMW","Tesla","Toyota","Ford"};
        int[] numbers = {10, 20, 30, 40};

        cars[2] = "Benz";
        System.out.println(cars[2]);

//        Loop through array
        for (int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

//      Simpler version
        for (String i: cars ){
            System.out.println(i);
        }
    }
}