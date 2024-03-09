package FrontEnd;

import resources.Cores.Jcor;

import javax.swing.*;
import java.awt.*;

public class ScreenRegistryWindow extends JFrame{
    public ScreenRegistryWindow(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800,500);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Registro de clientes");
        setLayout(null);

        JButton buttonSalve = new JButton("Salvar");

        buttonSalve.setBounds(100,200,200,70);
        buttonSalve.setForeground(new Color(32,120,104));
        buttonSalve.setBackground(new Color(239, 189, 36));
        add(buttonSalve);

    }
}
