import java.util.ArrayList;
import java.util.List;

import exceptions.NegativePriceException;
import product.ProductController;

public class main {



    public static ProductController Main(String[] args) throws NegativePriceException {
        
        
        List<ProductController> productList = new ArrayList<>();
        
        ProductController product1 = new ProductController();
        product1.setName("Produto 1");
        product1.setPriceInCents(1000);
        product1.setStock(10);
        productList.add(product1);

        ProductController product2 = new ProductController();
        product2.setName("Produto 2");
        product2.setPriceInCents(2000);
        product2.setStock(20);
        productList.add(product2);

     
        for (ProductController products : productList) {
            System.out.println("Código de barras: " + products.getBarCode());
            System.out.println("Nome: " + products.getName());
            System.out.println("Preço em centavos: " + products.getPriceInCents());
            System.out.println("Estoque: " + products.getStock());
            System.out.println();
        }
        
        return (ProductController) productList;


    }

    };