import javax.swing.*;
import java.awt.*;
import java.util.Enumeration;
import java.util.List;

public class Application {

    /**
     * Le but du main est d'afficher l'interface de visualisation d'un distributeur.
     *
     * - ajouter une classe `Application` où se trouvera la fonction `main` (`public static void main(String[] arguments)`)
     * - dans cette fonction, instanciez un distributeur avec quelques articles
     * - instanciez également une fenêtre `InterfaceDistributeur` qui prendra en paramètre votre distributeur
     * @param arguments
     */

    public static void main(String arguments[]) {
        setUIFont(new javax.swing.plaf.FontUIResource("Ubuntu", Font.PLAIN,48)); // Pour les écrans avec une grande résolution
        Distributeur distributeur = new Distributeur(
                "Machine 1",
                Position.DEPT_INFO,
                List.of(Product.values())
        );
        InterfaceDistributeur interfaceDistributeur = new InterfaceDistributeur(distributeur);
    }

    // Modifie la police d'écriture de façon globale, pratique pour les grands écrans
    public static void setUIFont(javax.swing.plaf.FontUIResource f){
        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get (key);
            if (value instanceof javax.swing.plaf.FontUIResource)
                UIManager.put (key, f);
        }
    }

}
