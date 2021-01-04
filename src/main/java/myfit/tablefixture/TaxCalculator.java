package myfit.tablefixture;

public class TaxCalculator {
    public double GetTax(String code, double price)
    {
        if (code.startsWith("B")) return 0;
        return 0.1 * price;
    }
}
