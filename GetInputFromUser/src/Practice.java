import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println(readInput());
    }
    public static String readInput(){
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        for (int i = 1; i<6; i++) {
            try {
                System.out.print("Enter number # " + i + ":");
                String num = scanner.nextLine();
                sum+= Integer.parseInt(num);

            }catch (NumberFormatException nfe){
                i--;
                System.out.println("Invalid value");
            }
        }
        return "Sum of all 5 entered numbers is : " + sum;
    }

}
