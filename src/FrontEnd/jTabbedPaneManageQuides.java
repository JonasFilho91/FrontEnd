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


        jPanelCustomerSearch        Consultar = new jPanelCustomerSearch();
        jPanelCustomerRegistration  Cadastrar = new jPanelCustomerRegistration();
            addTab("Consultar",null,Consultar);
            addTab("Cadastrar",null,Cadastrar);

    }
}
