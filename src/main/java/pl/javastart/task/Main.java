package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        PriceCalc priceCalc = new PriceCalc();

        Product product1 = new Product("Mleko", "3,2", 3, Category.DAIRY);
        Product product2 = new Product("Czekolada", "Mleczna", 3.5, Category.SWEETS);
        Product product3 = new Product("Orzechy", "Laskowe", 5.55);

        System.out.println(priceCalc.returnGrossPrice(product1));
        System.out.println(priceCalc.returnGrossPrice(product2));
        System.out.println(priceCalc.returnGrossPrice(product3));

    }
}
