import com.workintech.product.Bread;
import com.workintech.product.Chocolate;
import com.workintech.product.Coke;
import com.workintech.product.ProductForSale;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] product = {
                new Chocolate("Milk Chocolate" , 27,"%80 Milk Included Chocolate",120.0),
                new Coke("Vanilla Coke",21,"Vanilla included frozen coke",78),
                new Bread("Francala",28,"Oven Cooked",160)
        };

        listProducts(product);
    }

    public static void listProducts(ProductForSale[] products) {

        for (ProductForSale product : products){
            product.showDetails();
        }
    }
}