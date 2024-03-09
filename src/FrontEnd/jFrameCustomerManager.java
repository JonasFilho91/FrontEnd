package FrontEnd;

import javax.swing.*;

public class jFrameCustomerManager extends JFrame {
    public jFrameCustomerManager() {
        //Configurações da Janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Registro de clientes");
        setLayout(null);

        jInternalFrameCustomerRegistration WindCustomerRegistration = new jInternalFrameCustomerRegistration();
        jInternalFrameCustomerSearch WindCustomerSearch = new jInternalFrameCustomerSearch();

        add(WindCustomerRegistration);
        add(WindCustomerSearch);

    }
}
