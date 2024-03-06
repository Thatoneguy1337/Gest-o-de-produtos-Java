package product;

import java.util.ArrayList;
import java.util.List;
import exceptions.NegativePriceException;
import exceptions.NotFoundException;

public class ProductController{

     List<ProductModel> products;

    public ProductController(){
        this.products = new ArrayList<>();
    }

    public String create(ProductModel payload) throws NegativePriceException {
        if (payload.getPriceInCents() < 0) {
            throw new NegativePriceException();
        }

        products.add(payload);
        return "Produto '" + payload.getName() + "' adicionado.";
    }

    public List<ProductModel> read() {
        return products;
    }

    public int retrievePrice(String barCode) throws NotFoundException {
        for (ProductModel product : products) {
            if (product.getBarCode().equals(barCode)) {
                return product.getPriceInCents();
            }
        }
        throw new NotFoundException();
    }

}




