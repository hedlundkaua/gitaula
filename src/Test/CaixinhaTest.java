package Test;

import Entities.Person;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CaixinhaTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantas pessoas são: ");
        int n = sc.nextInt();

        Person[] per = new Person[n];

        for(int i = 0; i < per.length; i++){
            per[i] = new Person();

            System.out.print("Seu nome: ");
            String name = sc.next();

            System.out.print("Informe o valor que deseja adicionar: ");
            double amount = sc.nextDouble();

            per[i].setName(name);
            per[i].setAmount(amount);

        }
        for(int i = 0; i < per.length; i++){
            System.out.println("----------------------");
            System.out.println("Nome da " + (i+1) + " pessoa: " + per[i].getName());
            System.out.println("Valor aplicado da " + (i+1) + " pessoa: " + per[i].getAmount());
            System.out.println("----------------------");
        }

        sc.close();
    }
}
