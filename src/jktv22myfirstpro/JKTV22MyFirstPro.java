package jktv22myfirstpro;
import java.util.Scanner;
public class JKTV22MyFirstPro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String firstname = scanner.nextLine();
        System.out.print("Введите вашу фамилию: ");
        String lastname = scanner.nextLine();
        System.out.println("Привет " + firstname + " " + lastname + "!");
    }
    
}
