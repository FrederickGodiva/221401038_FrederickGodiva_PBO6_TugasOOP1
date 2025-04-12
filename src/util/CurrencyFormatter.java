package util;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    public static String format(double amount) {
        Locale indonesia = new Locale("id", "ID");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(indonesia);
        return formatter.format(amount);
    }
}
