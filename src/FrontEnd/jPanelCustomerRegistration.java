package FrontEnd;

import TabelaHash.Adapter;
import TabelaHash.CadastroUsuarioHash;
import resources.Outros.BoxSize;
import resources.Outros.FonteText;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Objects;

public class jPanelCustomerRegistration extends JPanel{
    public jPanelCustomerRegistration(){
        setSize(1200,700);
        setName("Cadastrar Clientes");
        setLayout(null);

        //Criação dos componentes

        //Labels and  JFormattedTextField
        //Título
        JLabel txtRegistrodeCliente = new JLabel("Sistema de Registro de Clientes");
        txtRegistrodeCliente.setSize(BoxSize.getSizeDimension());
        txtRegistrodeCliente.setFont(FonteText.getFonte_text());
        txtRegistrodeCliente.setLocation(80, 10);
        add(txtRegistrodeCliente);

        JLabel txtAdicionarCliente = new JLabel("Adicionar Cliente");
        txtAdicionarCliente.setSize(BoxSize.getSizeDimension());
        txtAdicionarCliente.setFont(FonteText.getFonte_text());
        txtAdicionarCliente.setLocation(80, txtRegistrodeCliente.getY() + txtRegistrodeCliente.getHeight() + 10);
        add(txtAdicionarCliente);

        //Título Nome
        JLabel txtNome = new JLabel("Nome*");
        txtNome.setSize(BoxSize.getSizeDimension());
        txtNome.setFont(FonteText.getFonte_text());
        txtNome.setLocation(80, txtAdicionarCliente.getY() + txtAdicionarCliente.getHeight() + 30);
        txtNome.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(txtNome);

        //Caixa de Texto Nome
        JFormattedTextField jFormattedTextFieldNome = new JFormattedTextField();
        jFormattedTextFieldNome.setFont(FonteText.getFonte_text());
        jFormattedTextFieldNome.setSize(350,BoxSize.getHeightStandard());
        jFormattedTextFieldNome.setLocation(80,txtNome.getY() + txtNome.getHeight() + 2);

        jFormattedTextFieldNome.setText("");
        add(jFormattedTextFieldNome);

        //Titulo CPF
        JLabel txtCPF = new JLabel("CPF*");
        txtCPF.setSize(BoxSize.getSizeDimension());
        txtCPF.setFont(FonteText.getFonte_text());
        txtCPF.setLocation(80,jFormattedTextFieldNome .getY() + jFormattedTextFieldNome.getHeight() + 10);
        txtCPF.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(txtCPF);

        //Caixa de Texto CPF
        JFormattedTextField jFormattedTextFieldCPF = new JFormattedTextField();
        jFormattedTextFieldCPF.setFont(FonteText.getFonte_text());
        jFormattedTextFieldCPF.setSize(350,BoxSize.getHeightStandard());
        jFormattedTextFieldCPF.setLocation(80,txtCPF.getY() + txtCPF.getHeight() + 2);

        jFormattedTextFieldCPF.setText("");
        add(jFormattedTextFieldCPF);

        //Título Celular
        JLabel txtCelular = new JLabel("Celular");
        txtCelular.setSize(BoxSize.getSizeDimension());
        txtCelular.setFont(FonteText.getFonte_text());
        txtCelular.setLocation(80, jFormattedTextFieldCPF.getY() + jFormattedTextFieldCPF.getHeight() + 10);
        txtCelular.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(txtCelular);

        //Caixa de Texto Celular
        JFormattedTextField jFormattedTextFieldCelular = new JFormattedTextField();
        jFormattedTextFieldCelular.setFont(FonteText.getFonte_text());
        jFormattedTextFieldCelular.setSize(350,BoxSize.getHeightStandard());
        jFormattedTextFieldCelular.setLocation(80,txtCelular.getY() + txtCelular.getHeight() + 2);

        jFormattedTextFieldCelular.setText("");
        add(jFormattedTextFieldCelular);

        //Título Email
        JLabel txtEmail = new JLabel("Email");
        txtEmail.setSize(BoxSize.getSizeDimension());
        txtEmail.setFont(FonteText.getFonte_text());
        txtEmail.setLocation(80, jFormattedTextFieldCelular.getY() + jFormattedTextFieldCelular.getHeight() + 10);
        txtEmail.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(txtEmail);

        //Caixa de Texto Email
        JFormattedTextField jFormattedTextFieldEmail = new JFormattedTextField();
        jFormattedTextFieldEmail.setFont(FonteText.getFonte_text());
        jFormattedTextFieldEmail.setSize(350,BoxSize.getHeightStandard());
        jFormattedTextFieldEmail.setLocation(80,txtEmail.getY() + txtEmail.getHeight() + 2);

        jFormattedTextFieldEmail.setText("");
        add(jFormattedTextFieldEmail);

        ImageIcon borracha1Icon = new ImageIcon("src/resources/Icons/apagador2.png");
        JButton ButtonClear = new JButton("Limpar",borracha1Icon);
        ButtonClear.setHorizontalAlignment(SwingConstants.CENTER);
        ButtonClear.setBounds(80, 400, 90, 25);
        ButtonClear.setBackground(new Color(240, 190, 35));
        add(ButtonClear);
        ButtonClear.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFormattedTextFieldNome.setText("");
                jFormattedTextFieldCPF.setText("");
                jFormattedTextFieldCelular.setText("");
                jFormattedTextFieldEmail.setText("");
            }
        });

        ImageIcon DisketIcon = new ImageIcon("src/resources/Icons/disco 2.png");
        JButton ButtonSalve = new JButton("Salvar",DisketIcon);
        ButtonSalve.setHorizontalAlignment(SwingConstants.CENTER);
        ButtonSalve.setBounds(200, 400, 90, 25);
        ButtonSalve.setBackground(new Color(30, 120, 105));
        add(ButtonSalve);
        ButtonSalve.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( (!Objects.equals(jFormattedTextFieldNome.getText(), "")) && (!Objects.equals(jFormattedTextFieldCPF.getText(), ""))) {
                    CadastroUsuarioHash.cadastrarUsuario(jFormattedTextFieldNome.getText(),
                            jFormattedTextFieldCPF.getText(),
                            jFormattedTextFieldCelular.getText(),
                            jFormattedTextFieldEmail.getText());
                    Adapter.Update_Data();
                    jFormattedTextFieldNome.setText("");
                    jFormattedTextFieldCPF.setText("");
                    jFormattedTextFieldCelular.setText("");
                    jFormattedTextFieldEmail.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "Nome e CPF não podem estar em branco. \n Tente novamente", "CAMPOS OBRIGATÓRIOS", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }

}
