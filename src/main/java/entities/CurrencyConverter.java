package entities;

public class CurrencyConverter {

    public static double dolarPrice;

    public static double dollarBuy;

    public static final double iOF=0.6;

    public static  double valorPago(){
        return (dolarPrice*dollarBuy)*(1+0.6);
    }
}
