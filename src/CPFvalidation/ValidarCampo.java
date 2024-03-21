package CPFvalidation;

import javax.swing.*;
import java.awt.*;

public class ValidarCampo {
    private static String str;

    public static Boolean Validar(JTextField OBJ) {
         if((OBJ.getText().isEmpty()) || (OBJ.getText().length() < 11) || (OBJ.getText().length() > 11)) {

             OBJ.setForeground(new Color(255, 20, 40));
             return false;
         }else{
             OBJ.setForeground(new Color(0, 0, 0));
            str = OBJ.getText().substring(OBJ.getText().length() - 1, OBJ.getText().length());

            if ((!str.matches("[0-9]"))) {
            JOptionPane.showMessageDialog(null, "É permitido apenas Números de 0-9", "CPF - ERRO", JOptionPane.ERROR_MESSAGE);
            OBJ.setText("");

            }
             return true;
        }

    }
}
