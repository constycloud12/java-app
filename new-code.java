import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        items.add(product);
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(Product::getPrice).sum();
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Product item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + calculateTotal());
    }
}

public class GSFOnlineStore {
    public static void main(String[] args) {
        // Create GSF online store product
        Product gsfProduct = new Product("GSF Product", 15.0);

        // Create shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add GSF product to the cart
        cart.addItem(gsfProduct);

        // Display the shopping cart
        cart.displayCart();
    }
}
