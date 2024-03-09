package FrontEnd;

import javax.swing.*;
import java.awt.*;

public class FrameCustomerSearch extends JFrame{
<<<<<<< HEAD

=======
    public FrameCustomerSearch(){
        //Configurações da Janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800,500);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Registro de clientes");
        setLayout(null);
>>>>>>> origin/master

        //Criação dos componentes

            //Botão Buscar
<<<<<<< HEAD
            ImageIcon lupaIcon = new ImageIcon("src/resources/Icons/disco.png");

=======
>>>>>>> origin/master
            JButton buttonSearch = new JButton("Salvar");
            buttonSearch.setBounds(100,200,89,23);
            buttonSearch.setForeground(new Color(32,120,104));
            add(buttonSearch);

            //Botão Limpar
<<<<<<< HEAD
            ImageIcon borrachaIcon = new ImageIcon("src/resources/Icons/disco.png");
=======
>>>>>>> origin/master
            JButton buttonToClean = new JButton("Salvar");
            buttonToClean.setBounds(100,200,89,23);
            buttonToClean.setBackground(new Color(239, 189, 36));
            add(buttonToClean);

    }
}
