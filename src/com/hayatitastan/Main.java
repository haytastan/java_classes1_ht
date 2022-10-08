package com.hayatitastan;
import java.util.Scanner;
/**
 * Created by Dr. Hayati TASTAN on 3.10.2022 **
 **/
public class Main {
    public static void main(String[] args) {
        // classes
        CustomerManager manager = new CustomerManager();

        char grade;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter A(dd),R(emove),U(pdate) or Q(uit) : ");
            grade = input.next().charAt(0);

            switch (grade) {
                case 'A':
                    manager.Add();
                    continue;
                case 'R':
                    manager.Remove();
                    continue;
                case 'U':
                    manager.Update();
                    continue;
                case 'Q':
                    System.out.println("Quiting");
                    break;
                default:
                    System.out.println("You didn't enter a correct option!");
            }
        } while (grade != 'Q');

    }
}
