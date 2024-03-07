package product;

import java.util.UUID;

public class ProductModel {

    private String barCode;
    private String name;
    private int priceInCents;
    private int stock;



    public ProductModel(String name, int priceInCents, int stock) {
        this.name = name;
        this.priceInCents = priceInCents;
        this.stock = stock;
        this.barCode = generateRandomBarcode();
    }



    private String generateRandomBarcode() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("-", "").substring(0, 12);
    }



    public String getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}


