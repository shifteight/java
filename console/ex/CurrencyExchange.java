import java.text.DecimalFormat;

//DecimalFormat is discussed in 
//http://java.sun.com/docs/books/tutorial/java/data/decimalFormat.html

public class CurrencyExchange {
    static double FRANCS_PER_DOLLAR = 6.85062;

    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("###,###.00");
        double numFrancs = 10000000.0;
        double numDollars = numFrancs/FRANCS_PER_DOLLAR;

        System.out.println(formatter.format(numFrancs)
                           + "FF is equal to $"
                           + formatter.format(numDollars)
                           + ".");
    }
}
