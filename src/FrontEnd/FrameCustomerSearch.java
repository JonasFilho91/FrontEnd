package FrontEnd;

import javax.swing.*;
import java.awt.*;

public class FrameCustomerSearch extends JFrame{


        //Criação dos componentes

            //Botão Buscar
            ImageIcon lupaIcon = new ImageIcon("src/resources/Icons/disco.png");

            JButton buttonSearch = new JButton("Salvar");
            buttonSearch.setBounds(100,200,89,23);
            buttonSearch.setForeground(new Color(32,120,104));
            add(buttonSearch);

            //Botão Limpar
            ImageIcon borrachaIcon = new ImageIcon("src/resources/Icons/disco.png");
            JButton buttonToClean = new JButton("Salvar");
            buttonToClean.setBounds(100,200,89,23);
            buttonToClean.setBackground(new Color(239, 189, 36));
            add(buttonToClean);

    }
}
