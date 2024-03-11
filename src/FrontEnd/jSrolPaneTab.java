package FrontEnd;

import javax.swing.*;
import java.awt.*;

public class jSrolPaneTab extends JScrollPane{

    public jSrolPaneTab(){
        JTable mTab = new JTable(new jTabModel());
        setColumnHeaderView(mTab);
        mTab.setRowHeight(30);
        setFont(new Font("Calibri",0,12));
    }

}
