package pl.javastart.task;

public class Product {
    private String productName;
    private String description;
    private double nettPrice;
    private String productCategory;

    public Product(String productName, String description, double nettPrice, String productCategory) {
        this(productName, description, nettPrice);
        this.productCategory = productCategory;
    }

    public Product(String productName, String descripiton, double nettPrice) {
        this.productName = productName;
        this.description = descripiton;
        this.nettPrice = nettPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescripiton() {
        return description;
    }

    public void setDescripiton(String descripiton) {
        this.description = descripiton;
    }

    public double getNettPrice() {
        return nettPrice;
    }

    public void setNettPrice(double nettPrice) {
        this.nettPrice = nettPrice;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
}
