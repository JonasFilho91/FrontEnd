package FrontEnd.Table;

import javax.swing.*;
import java.awt.*;

public class jSrolPaneTab extends JScrollPane{

    public jSrolPaneTab(JTable tabela){
        tabela.setRowHeight(30);
        setFont(new Font("Calibri",0,12));
    }

}
