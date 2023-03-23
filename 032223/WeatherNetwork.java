public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).


        int temp = -12;

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!
        if (temp <= -1) {
            forecast += "FREEZING";
            System.out.println("The forecast is "+ forecast + "! Stay home");
        } else if (temp <= 10){
            forecast += "Chilly";
            System.out.println("The forecast is " + forecast + ". Wear a coat!");
        } else {
            forecast += "warm";
            System.out.println("The forecast is " + forecast + ". Wear a coat!");
        }


        System.out.println(forecast);
    }
}
