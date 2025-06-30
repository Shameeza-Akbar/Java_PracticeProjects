import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int year = 2025;
        System.out.println(inputFromUser(year));
    }


    public static String inputFromUser(int year){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("What is you birth year?");
        String birthYear= scanner.nextLine();
        int age = year - Integer.parseInt(birthYear);
        return name + " is " + age + " years old.";
    }

}
