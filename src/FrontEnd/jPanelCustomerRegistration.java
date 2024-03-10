package FrontEnd;

import javax.swing.*;
import java.awt.*;

public class jPanelCustomerRegistration extends JPanel{
public jPanelCustomerRegistration(){
    setSize(800,500);
    setName("Consultar Clientes");
    setLayout(null);



    JButton ButtonClear = new JButton("Limpar");
    ButtonClear.setBounds(500, 400, 90, 25);
    ButtonClear.setBackground(new Color(240, 190, 35));
    add(ButtonClear);


    JButton ButtonSalve = new JButton("Salvar");
    ButtonSalve.setBounds(600, 400, 90, 25);
    ButtonSalve.setBackground(new Color(30, 120, 105));
    add(ButtonSalve);


}

}
