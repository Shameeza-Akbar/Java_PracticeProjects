//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            printMegaBytesAndKiloBytes(i*50);
        }
    }
    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if (kiloBytes<0){
            System.out.print("Invalid Value");
            return;
        }
        int megaBytes = Math.round(kiloBytes/1024);
        System.out.println(kiloBytes+ " KB = "+ megaBytes + " MB and " + kiloBytes%1024 + " KB");
    }
}

