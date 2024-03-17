package FrontEnd;

import resources.Outros.TamanhoWindons;

import javax.swing.*;

public class jFrameCustomerManager extends JFrame {
    public jFrameCustomerManager() {
        //Atributos da Janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(new TamanhoWindons());
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Registro de clientes");
        setLayout(null);

        //Guias
        JTabbedPane Guias = new jTabbedPaneManageQuides();

        add(Guias);

    }
}
