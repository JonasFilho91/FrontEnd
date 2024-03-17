package FrontEnd;

import javax.swing.*;
import java.awt.*;

public class jSrolPaneTab extends JScrollPane{

    public jSrolPaneTab(JTable myTabView){

        JViewport jViewportnew = new JViewport();
        jViewportnew.setView(myTabView);

        setColumnHeaderView(myTabView.getTableHeader());
        setViewport(jViewportnew);
        myTabView.setFillsViewportHeight(true);
        myTabView.setRowHeight(30);
        setFont(new Font("Calibri",0,30));
    }

}
