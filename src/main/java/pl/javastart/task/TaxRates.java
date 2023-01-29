package pl.javastart.task;

public class TaxRates {
    private static final double TAX_RATE1 = 0.08;
    private static final double TAX_RATE2 = 0.16;
    private static final double TAX_RATE3 = 0.23;

    double grossPriceCalcTax1(Product product) {
        return product.getNettPrice() + product.getNettPrice() * TAX_RATE1;
    }

    double grossPriceCalcTax2(Product product) {
        return product.getNettPrice() + product.getNettPrice() * TAX_RATE2;
    }

    double grossPriceCalcTax3(Product product) {
        return product.getNettPrice() + product.getNettPrice() * TAX_RATE3;
    }
}
