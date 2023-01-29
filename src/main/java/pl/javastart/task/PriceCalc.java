package pl.javastart.task;

public class PriceCalc {
    private TaxRates taxRates = new TaxRates();

    public double returnGrossPrice(Product product) {
        if (product.getProductCategory() == null) {
            double grossPrice = taxRates.grossPriceCalcTax3(product);
            return grossPrice;
        } else {
            double grossPrice = switch (product.getProductCategory()) {
                case "Nabiał" -> taxRates.grossPriceCalcTax1(product);
                case "Słodycze" -> taxRates.grossPriceCalcTax2(product);
                default -> taxRates.grossPriceCalcTax3(product);
            };
            return grossPrice;
        }
    }
}