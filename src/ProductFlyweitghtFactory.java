import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductFlyweitghtFactory {
    private static List<Product> products = new ArrayList<Product>();

    public  Product getProduct(String brand){
        Product oldProduct =null;
        for (Product p:
             products) {
            if(p.brand == brand){
                oldProduct = p;
            }
        }

        if(oldProduct == null){
            Product newProduct = new Product(brand);
            products.add(newProduct);
            return newProduct;
        }else{
            return oldProduct;
        }

    }

}
