import javax.swing.*;
import java.awt.*;
import java.util.Enumeration;
import java.util.List;

public class Application {

    public static void main(String arguments[]) {
        setUIFont(new javax.swing.plaf.FontUIResource("Ubuntu", Font.PLAIN,48)); // Pour les écrans avec une grande résolution

        Distributeur distributeur = new Distributeur(
                "Distributeur 1",
                Position.DEPT_INFO,
                Product.getProductsFromType(TypeMachine.DISTRIBUTEUR)
        );
        InterfaceDistributeur interfaceDistributeur = new InterfaceDistributeur(distributeur);

        MachineACafe machineACafe = new MachineACafe(
                "Machine à café 1",
                Position.DEPT_INFO,
                Product.getProductsFromType(TypeMachine.MACHINE_A_CAFE)
        );
        InterfaceMachineACafe interfaceMachineACafe = new InterfaceMachineACafe(machineACafe);
    }

    // Modifie la police d'écriture de façon globale, pratique pour les grands écrans
    public static void setUIFont(javax.swing.plaf.FontUIResource f) {
        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get (key);
            if (value instanceof javax.swing.plaf.FontUIResource)
                UIManager.put (key, f);
        }
    }

}
