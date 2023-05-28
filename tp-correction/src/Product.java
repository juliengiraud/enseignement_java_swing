import java.util.ArrayList;
import java.util.List;

public enum Product {

    CAFE("Café", TypeMachine.MACHINE_A_CAFE),
    CAPPUCCINO("Cappuccino", TypeMachine.MACHINE_A_CAFE),
    CHOCOLAT_CHAUD("Chocolat chaud", TypeMachine.MACHINE_A_CAFE),
    THE("Thé", TypeMachine.MACHINE_A_CAFE),
    KIT_KAT("KitKat", TypeMachine.DISTRIBUTEUR),
    M_NMS("M&M's", TypeMachine.DISTRIBUTEUR),
    JUS_ORANGE("Jus d'orange", TypeMachine.DISTRIBUTEUR)
    ;

    private final String caption;
    private final TypeMachine type;

    Product(String caption, TypeMachine type) {
        this.caption = caption;
        this.type = type;
    }

    @Override
    public String toString() {
        return caption;
    }

    public TypeMachine getType() {
        return type;
    }

    public static List<Product> getProductsFromType(TypeMachine type) {
        List<Product> products = new ArrayList<>();
        for (Product product : values()) {
            if (product.getType().equals(type)) {
                products.add(product);
            }
        }
        return products;
    }

}
