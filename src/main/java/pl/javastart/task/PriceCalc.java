package pl.javastart.task;

public class PriceCalc {

    private static final double TAX_RATE_SWEETS = 0.08;
    private static final double TAX_RATE_DAIRY = 0.16;
    private static final double TAX_RATE_UNIVERSAL = 0.23;

    public double returnGrossPrice(Product product) {
        double taxRate;
        if (product.getCategory() == null) {
            return product.getNettPrice() + product.getNettPrice() * TAX_RATE_UNIVERSAL;
        } else {
            taxRate =  switch (product.getCategory()) {
                case Category.SWEETS ->  TAX_RATE_SWEETS;
                case Category.DAIRY ->  TAX_RATE_DAIRY;
                default ->  TAX_RATE_UNIVERSAL;
            };
        }
        return product.getNettPrice() + product.getNettPrice() * taxRate;
    }
}