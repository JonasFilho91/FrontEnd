package FrontEnd;

import javax.swing.*;

public class jTabbedPaneManageQuides extends JTabbedPane {

    public jTabbedPaneManageQuides(){
        setVisible(true);
        setTabLayoutPolicy(WRAP_TAB_LAYOUT);
        setBounds(0,0,800,500);


        jPanelCustomerSearch Consultar = new jPanelCustomerSearch();
        jPanelCustomerRegistration Cadastrar = new jPanelCustomerRegistration();
            addTab("Consultar",null,Consultar);
            addTab("Cadastrar",null,Cadastrar);

    }
}
