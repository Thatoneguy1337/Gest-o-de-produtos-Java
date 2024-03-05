import product.ProductModel;

public class main {

 public static void Main(String[] args) {
        
        ProductModel product = new ProductModel();

        
        product.setBarCode("123456789");
        product.setName("Product Name");
        product.setPriceInCents(1000);
        product.setStock(10);

        
    
        System.out.println("Barcode: " + product.getBarCode());
        System.out.println("Name: " + product.getName());
        System.out.println("Price in cents: " + product.getPriceInCents());
        System.out.println("Stock: " + product.getStock());
    }    




};