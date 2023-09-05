package jktv22myfirstpro;
import java.util.Scanner;
public class JKTV22MyFirstPro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String firstname = scanner.nextLine();
        System.out.print("Введите вашу фамилию: ");
        String lastname = scanner.nextLine();
        System.out.println("Hello " + firstname + " " + lastname + "!");
        System.out.print("Введите год вашего рождения: ");
        int currentYear = 2023;
        int currentMonth = 9;
        int currentDay = 1;
        int yourYear = scanner.nextInt();
        int old = currentYear - yourYear;
        System.out.println("Вам " + old + " лет");
    }
    
}
