import javax.swing.*;

public class InterfaceMachineACafe extends InterfaceMachine {

    JLabel stockGobelets;
    MachineACafe machineACafe;

    public InterfaceMachineACafe(MachineACafe machineACafe) {
        super(machineACafe);
        this.machineACafe = machineACafe;
        this.initComponents();
        this.pack();
    }

    private void initComponents() {
        JPanel panelGobelets = new JPanel();
        this.stockGobelets = new JLabel("Stock gobelets : " + machineACafe.getStockGobelet());
        panelGobelets.add(this.stockGobelets);
        this.getContentPane().add(this.stockGobelets);
    }

}
