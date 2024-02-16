package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter cu = new CurrencyConverter();
        System.out.println("what is the dollar price?");
        double dolarPrice =  sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double dollarBuy = sc.nextDouble();

        System.out.printf("Amount to be paid in reais= %.2f%n", cu.valorPago());

    }
}