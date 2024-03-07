
import exceptions.NegativePriceException;
import exceptions.NotFoundException;
import product.ProductController;
import product.ProductModel;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();

        String barCode;
        
        ProductModel newProduct = new ProductModel(null, 0, 0);
        newProduct.setName("Produto A");
        newProduct.setPriceInCents(1000); 
        newProduct.setStock(10);

        try {
            String message = productController.create(newProduct);
            System.out.println(message);
        } catch (NegativePriceException e) {
            System.out.println(e.getMessage());
        }

        
        System.out.println("Lista de Produtos:");
        for (ProductModel product : productController.read()) {
            System.out.println("Código de Barras: " + product.getBarCode());
            System.out.println("Nome: " + product.getName());
            System.out.println("Preço em Centavos: " + product.getPriceInCents());
            System.out.println("Estoque: " + product.getStock());
            System.out.println("-------------------------------------");
        }

        



        barCode = "3cc5db841fbf"; 
        try {
            int price = productController.retrievePrice(barCode);
            System.out.println("Preço do produto com código de barras " + barCode + ": " + price);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

};