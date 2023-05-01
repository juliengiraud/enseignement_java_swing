import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Distributeur {

    private String name;
    private Position position;
    private Map<Product, Integer> stocks;

    public Distributeur(String name, Position position, List<Product> products) {
        this.name = name;
        this.position = position;
        this.stocks = new HashMap();
        for (Product product : products) {
            stocks.put(product, 10);
        }
    }

    public Set<Product> getProducts() {
        return this.stocks.keySet();
    }

    public Integer getStock(Product product) {
        return this.stocks.get(product);
    }

    public boolean order(Product product) {
        if (this.stocks.containsKey(product)) {
            Integer stock = this.stocks.get(product);
            if (stock > 0) {
                this.stocks.put(product, stock - 1);
                return true;
            }
        }
        return false; // Soit le produit n'existe pas, soit son stock est de 0
    }

    public void fill(Product product, Integer quantity) {
        Integer currentStock = this.stocks.get(product);
        this.stocks.put(product, currentStock + quantity);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}
