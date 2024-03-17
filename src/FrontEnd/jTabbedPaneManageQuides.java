package FrontEnd;

import FrontEnd.Table.MyJTabModel;
import TabelaHash.Adapter;
import TabelaHash.Usuario;
import resources.Outros.TamanhoWindons;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class jTabbedPaneManageQuides extends JTabbedPane {

    public jTabbedPaneManageQuides(){
        //Atributos
        setVisible(true);
        setTabLayoutPolicy(WRAP_TAB_LAYOUT);
        setBounds(0,0,1200,700);
        setLocation(0,0);
        setSize(new TamanhoWindons());

        //Objtos......................................................................................................

        //Tabela Hash
        Map < String , Usuario>    usuarioMap          = new HashMap<>();

        //Atapitador
        Adapter.setMyTabHash(usuarioMap);

        //Tabela view
        JTable myTabView = new JTable(new MyJTabModel());
        myTabView.setAutoCreateColumnsFromModel(true);


        Adapter.setMyTabView(myTabView);
        //Guias
        jPanelCustomerRegistration  Cadastrar = new jPanelCustomerRegistration();
        jPanelCustomerSearch        Consultar = new jPanelCustomerSearch();

        addTab("Cadastrar",null,Cadastrar);
        addTab("Consultar",null,Consultar);
        setSelectedIndex(1);


    }
}
