package FrontEnd;

import resources.Outros.TamanhoWindons;

import javax.swing.*;

public class jFrameCustomerManager extends JFrame {
    public jFrameCustomerManager() {
        //Configurações da Janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(new TamanhoWindons());
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Registro de clientes");
        setLayout(null);

        JTabbedPane guias = new jTabbedPaneManageQuides();

        add(guias);

    }
}
