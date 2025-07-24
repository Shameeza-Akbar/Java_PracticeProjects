//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        boolean bark = true;
        for (int i = 1; i <= 24; i++) {

            System.out.println( "Dog shloud bark : " + shouldWakeUp(bark, i));
            bark=!bark;
        }

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }
}