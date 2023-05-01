import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Enfin, le titre de la fenêtre sera le nom de son distributeur.
 *
 *
 *   - va initialiser les autres attributs de votre classe (JLabel, liste de JLabel…)
 *   - mette les bonnes valeurs dans ces attributs
 *   - remplir la liste de JLabel tel que chaque JLabel contienne le nom et la quantité d'un produit (par exemple `KIT_KAT : 3`)
 *   - ajouter tous les éléments à afficher dans des conteneurs (les stocks doivent être dans un conteneur différent du reste)
 */

public class InterfaceDistributeur extends JFrame {

    private Distributeur distributeur;
    private JLabel position;
    private JLabel products;
    private JButton order;
    private List<JLabel> stocks;

    public InterfaceDistributeur(Distributeur distributeur) {
        this.distributeur = distributeur;
        this.setTitle(distributeur.getName());
        this.initComponents();
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initComponents() {
        // Instanciation des composants
        this.position = new JLabel(this.distributeur.getPosition().toString());
        String productsString = ""; // Pour this.products
        this.stocks = new ArrayList<>();
        for (Product product : distributeur.getProducts()) { // Pour this.products ET this.stocks
            productsString += product.toString() + ", ";
            Integer stock = distributeur.getStock(product);
            JLabel stockProduct = new JLabel(product + " : " + stock);
            this.stocks.add(stockProduct);
        }
        productsString = productsString.substring(0, productsString.length() - 2); // Pour enlever le ", " en trop
        this.products = new JLabel(productsString);
        this.order = new JButton("Commander");

        // Ajout des composants dans des panels
        JPanel panelInfos = new JPanel();
        panelInfos.add(this.position);
        panelInfos.add(this.products);
        JPanel panelButtons = new JPanel();
        panelButtons.add(this.order);
        JPanel panelStocks = new JPanel();
        for (JLabel stock : this.stocks) {
            panelStocks.add(stock);
        }

        // Ajout des panels dans la fenêtre
        JPanel panelDistributeur = (JPanel) getContentPane();
        panelDistributeur.setLayout(new BoxLayout(panelDistributeur, BoxLayout.Y_AXIS));
        panelDistributeur.add(panelInfos);
        panelDistributeur.add(panelButtons);
        panelDistributeur.add(panelStocks);
    }

}
