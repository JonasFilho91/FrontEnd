package CPFvalidation;

import javax.swing.*;
import java.awt.*;

public class ValidarCampo {
    //private static final String Tipo;
    private static String str;

    public static Boolean ValidarCPF(JTextField OBJ, String Tipo) {

        if ((OBJ.getText().isEmpty())) {
            return false;

        } else {
            str = OBJ.getText().substring(OBJ.getText().length() - 1, OBJ.getText().length());
            if (!str.matches("[0-9]")) {
                JOptionPane.showMessageDialog(null, "É permitido apenas Números de 0-9", "CPF - ERRO", JOptionPane.ERROR_MESSAGE);
                OBJ.setText("");
                return false;

            } else if ((OBJ.getText().length() < 11) || (OBJ.getText().length() > 11)) {
                OBJ.setForeground(new Color(255, 20, 40));
                return false;

            } else {
                OBJ.setForeground(new Color(0, 0, 0));
                return true;
            }
        }
    }

    public static boolean ValidarCelular(JTextField OBJ, String Tipo) {
        if ((OBJ.getText().isEmpty())) {
            return true;
        } else {
            str = OBJ.getText().substring(OBJ.getText().length() - 1, OBJ.getText().length());
            if (!str.matches("[0-9]")) {
                JOptionPane.showMessageDialog(null, "É permitido apenas Números de 0-9", "CPF - ERRO", JOptionPane.ERROR_MESSAGE);
                OBJ.setText("");
                return false;
            }
            return true;

        }
    }
}
