package pl.javastart.task;

public class TaxRates {
    private double taxRate1 = 0.08;
    private double taxRate2 = 0.16;
    private double taxRate3 = 0.23;

    double grossPriceCalcTax1(Product product) {
        return product.getNettPrice() + product.getNettPrice() * taxRate1;
    }

    double grossPriceCalcTax2(Product product) {
        return product.getNettPrice() + product.getNettPrice() * taxRate2;
    }

    double grossPriceCalcTax3(Product product) {
        return product.getNettPrice() + product.getNettPrice() * taxRate3;
    }
}
