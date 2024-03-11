package FrontEnd;

import resources.Outros.TamanhoWindons;

import javax.swing.*;

public class jTabbedPaneManageQuides extends JTabbedPane {

    public jTabbedPaneManageQuides(){
        setVisible(true);
        setTabLayoutPolicy(WRAP_TAB_LAYOUT);
        setBounds(0,0,1200,700);
        setLocation(0,0);
        setSize(new TamanhoWindons());

        jPanelCustomerRegistration  Cadastrar = new jPanelCustomerRegistration();
        jPanelCustomerSearch        Consultar = new jPanelCustomerSearch();

        addTab("Cadastrar",null,Cadastrar);
        addTab("Consultar",null,Consultar);
        setSelectedIndex(1);

    }
}
