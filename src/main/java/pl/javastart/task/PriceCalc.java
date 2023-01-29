package pl.javastart.task;

public class PriceCalc {
    private final TaxRates taxRates = new TaxRates();

    public double returnGrossPrice(Product product) {
        if (product.getProductCategory() == null) {
            return taxRates.grossPriceCalcTax3(product);
        } else {
            return switch (product.getProductCategory()) {
                case Category.SWEETS -> taxRates.grossPriceCalcTax1(product);
                case Category.DAIRY -> taxRates.grossPriceCalcTax2(product);
                default -> taxRates.grossPriceCalcTax3(product);
            };
        }
    }
}