package FrontEnd;

import resources.Outros.BoxSize;
import resources.Outros.FonteText;

import javax.swing.*;
import java.awt.*;

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
    JLabel txtNome = new JLabel("Nome");
    txtNome.setSize(BoxSize.getSizeDimension());
    txtNome.setFont(FonteText.getFonte_text());
    txtNome.setLocation(80, txtAdicionarCliente.getY() + txtAdicionarCliente.getHeight() + 30);
    txtNome.setVerticalTextPosition(SwingConstants.BOTTOM);
    add(txtNome);

    //Caixa de Texto
    JFormattedTextField JFormattedTextFieldNome = new JFormattedTextField();
    JFormattedTextFieldNome.setFont(FonteText.getFonte_text());
    JFormattedTextFieldNome.setSize(350,BoxSize.getHeightStandard());
    JFormattedTextFieldNome.setLocation(80,txtNome.getY() + txtNome.getHeight() + 2);
    add(JFormattedTextFieldNome);

    //Titulo CPF
    JLabel txtCPF = new JLabel("CPF");
    txtCPF.setSize(BoxSize.getSizeDimension());
    txtCPF.setFont(FonteText.getFonte_text());
    txtCPF.setLocation(80,JFormattedTextFieldNome .getY() + JFormattedTextFieldNome.getHeight() + 10);
    txtCPF.setVerticalTextPosition(SwingConstants.BOTTOM);
    add(txtCPF);

    //Caixa de Texto
    JFormattedTextField jFormattedTextFieldCPF = new JFormattedTextField();
    jFormattedTextFieldCPF.setFont(FonteText.getFonte_text());
    jFormattedTextFieldCPF.setSize(350,BoxSize.getHeightStandard());
    jFormattedTextFieldCPF.setLocation(80,txtCPF.getY() + txtCPF.getHeight() + 2);
    add(jFormattedTextFieldCPF);

    //Título Celular
    JLabel txtCelular = new JLabel("Celular");
    txtCelular.setSize(BoxSize.getSizeDimension());
    txtCelular.setFont(FonteText.getFonte_text());
    txtCelular.setLocation(80, jFormattedTextFieldCPF.getY() + jFormattedTextFieldCPF.getHeight() + 10);
    txtCelular.setVerticalTextPosition(SwingConstants.BOTTOM);
    add(txtCelular);

    //Caixa de Texto
    JFormattedTextField jFormattedTextFieldCelular = new JFormattedTextField();
    jFormattedTextFieldCelular.setFont(FonteText.getFonte_text());
    jFormattedTextFieldCelular.setSize(350,BoxSize.getHeightStandard());
    jFormattedTextFieldCelular.setLocation(80,txtCelular.getY() + txtCelular.getHeight() + 2);
    add(jFormattedTextFieldCelular);

    //Título Email
    JLabel txtEmail = new JLabel("Email");
    txtEmail.setSize(BoxSize.getSizeDimension());
    txtEmail.setFont(FonteText.getFonte_text());
    txtEmail.setLocation(80, jFormattedTextFieldCelular.getY() + jFormattedTextFieldCelular.getHeight() + 10);
    txtEmail.setVerticalTextPosition(SwingConstants.BOTTOM);
    add(txtEmail);

    //Caixa de Texto
    JFormattedTextField jFormattedTextFieldEmail = new JFormattedTextField();
    jFormattedTextFieldEmail.setFont(FonteText.getFonte_text());
    jFormattedTextFieldEmail.setSize(350,BoxSize.getHeightStandard());
    jFormattedTextFieldEmail.setLocation(80,txtEmail.getY() + txtEmail.getHeight() + 2);
    add(jFormattedTextFieldEmail);


    JButton ButtonClear = new JButton("Limpar");
    ButtonClear.setBounds(80, 400, 90, 25);
    ButtonClear.setBackground(new Color(240, 190, 35));
    add(ButtonClear);


    JButton ButtonSalve = new JButton("Salvar");
    ButtonSalve.setBounds(200, 400, 90, 25);
    ButtonSalve.setBackground(new Color(30, 120, 105));
    add(ButtonSalve);


}

}
