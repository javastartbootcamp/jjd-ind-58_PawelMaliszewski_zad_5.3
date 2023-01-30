package pl.javastart.task;

public class Product {
    private String name;
    private String description;
    private double nettPrice;
    private String category;

    public Product(String name, String description, double nettPrice, String category) {
        this(name, description, nettPrice);
        this.category = category;
    }

    public Product(String name, String descripiton, double nettPrice) {
        this.name = name;
        this.description = descripiton;
        this.nettPrice = nettPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
