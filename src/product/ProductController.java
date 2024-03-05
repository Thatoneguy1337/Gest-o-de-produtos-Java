package product;


public class ProductController{

    private ProductModel product;

    public void Product(String barCode, String name, int priceInCents, int stock ){

        this.product = new ProductModel();
        this.product.setBarCode(barCode);
        this.product.setName(name);
        this.product.setPriceInCents(priceInCents);
        this.product.setStock(stock);
    }



    public String getBarCode() {
        return this.product.getBarCode();
    }

    public String getName() {
        return this.product.getName();
    }

    public void setName(String name) {
        this.product.setName(name);
    }

    public int getPriceInCents() {
        return this.product.getPriceInCents();
    }

    public void setPriceInCents(int priceInCents) {
        this.product.setPriceInCents(priceInCents);
    }

    public int getStock() {
        return this.product.getStock();
    }

    public void setStock(int stock) {
        this.product.setStock(stock);
    }

}




