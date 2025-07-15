//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1;
        }
        else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }
    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }

    public static void main(String[] args) {
        toMilesPerHour(1.5);
        printConversion(5.2);
    }

}