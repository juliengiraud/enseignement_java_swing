import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public abstract class InterfaceMachine extends JFrame {

    private Machine machine;
    private JLabel position;
    private JLabel products;
    private JButton order;
    private List<JLabel> stocks;

    public InterfaceMachine(Machine machine) {
        this.machine = machine;
        this.setTitle(machine.getName());
        this.initComponents();
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initComponents() {
        // Instanciation des composants
        this.position = new JLabel(this.machine.getPosition().toString());
        String productsString = ""; // Pour this.products
        this.stocks = new ArrayList<>();
        for (Product product : machine.getProducts()) { // Pour this.products ET this.stocks
            productsString += product.toString() + ", ";
            Integer stock = machine.getStock(product);
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
