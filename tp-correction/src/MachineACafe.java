import java.util.List;

public class MachineACafe extends Machine {

    private Integer stockGobelet;

    public MachineACafe(String name, Position position, List<Product> products) {
        super(name, position, products);
        this.stockGobelet = 10;
    }

    @Override
    public Integer getStock(Product product) {
        Integer stock = super.getStock(product);
        return Math.min(stock, stockGobelet);
    }

    @Override
    public boolean order(Product product) {
        if (stockGobelet.equals(0)) {
            return false;
        } else {
            return super.order(product);
        }
    }

    public void fillGobelets(Integer quantity) {
        this.stockGobelet += quantity;
    }

    public Integer getStockGobelet() {
        return stockGobelet;
    }
}
