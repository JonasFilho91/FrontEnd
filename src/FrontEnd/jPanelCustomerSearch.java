package FrontEnd;

import resources.Outros.BoxSize;

import javax.swing.*;
import java.awt.*;

public class jPanelCustomerSearch extends JPanel{
    public jPanelCustomerSearch(){
        //Configurações da Painel
        setSize(1200,650);
        setName("Filtrar Registros");
        setLayout(null);

        //Criação dos componentes

            //Labels and  JFormattedTextField
            //Titulo
            JLabel txtTitulo = new JLabel("Sistema de Registro de Clientes");
            txtTitulo.setSize(BoxSize.getSizeDimension());
            txtTitulo.setFont(FonteText.getFonte_text());
            txtTitulo.setLocation(80,10);
            add(txtTitulo);

            //Titulo CPF
            JLabel txtCPF = new JLabel("CPF");
            txtCPF.setSize(BoxSize.getSizeDimension());
            txtCPF.setFont(FonteText.getFonte_text());
            txtCPF.setLocation(80,txtTitulo.getY() + txtTitulo.getHeight() + 10);
            txtCPF.setVerticalTextPosition(SwingConstants.BOTTOM);
            add(txtCPF);

            //Caixa de Texto
            JFormattedTextField jFormattedTextFieldCPF = new JFormattedTextField();
            jFormattedTextFieldCPF.setFont(FonteText.getFonte_text());
            jFormattedTextFieldCPF.setSize(350,BoxSize.getHeightStandard());
            jFormattedTextFieldCPF.setLocation(80,txtCPF.getY() + txtCPF.getHeight() + 2);
            add(jFormattedTextFieldCPF);

            //Botão Buscar
            ImageIcon lupaIcon = new ImageIcon("src/resources/Icons/procurar2.png");
            JButton buttonSearch = new JButton("Buscar",lupaIcon);
            buttonSearch.setHorizontalAlignment(SwingConstants.CENTER);
            buttonSearch.setSize(150,BoxSize.getHeightStandard());
            buttonSearch.setLocation(80,jFormattedTextFieldCPF.getY() + jFormattedTextFieldCPF.getHeight() + 10);
            buttonSearch.setForeground(new Color(40, 140, 95));
            add(buttonSearch);

            //Botão Limpar
            ImageIcon borrachaIcon = new ImageIcon("src/resources/Icons/apagador.png");
            buttonSearch.setHorizontalAlignment(SwingConstants.CENTER);
            JButton buttonToClean = new JButton("Salvar");
            buttonToClean.setSize(150,BoxSize.getHeightStandard());
            buttonToClean.setLocation(buttonSearch.getX() + buttonSearch.getWidth() + 10,buttonSearch.getY());
            buttonToClean.setBackground(new Color(239, 189, 36));
            add(buttonToClean);

            //Titulo Lista de clientes
            JLabel txtListadeClientes = new JLabel("Lista de Clientes");
            txtListadeClientes.setSize(BoxSize.getSizeDimension());
            txtListadeClientes.setFont(FonteText.getFonte_text());
            txtListadeClientes.setLocation(80,buttonSearch.getY() + buttonSearch.getHeight() + 10);
            add(txtListadeClientes);

            //Tabela de pesquisa


    }
}
