package TabelaHash;

import javax.swing.*;
import java.util.Map;

public class Adapter {

    //Atributos
    public static Map < String , Usuario> myTabHash;
    public static JTable myTabView;
    public static Object[][] data = {{"","","",""}};

    //Getter's
    public static Map<String, Usuario> getMyTabHash() {
        return myTabHash;
    }
    public static JTable getMyTabView() {
        return myTabView;
    }

    public static Object[][] getData() {
        return data;
    }

    //Setter's
    public static void setMyTabHash(Map<String, Usuario> myTabHash) {
        Adapter.myTabHash = myTabHash;
    }
    public static void setMyTabView(JTable myTabView) {
        Adapter.myTabView = myTabView;
    }

    public static void setData(Object[][] data) {
        Adapter.data = data;
        System.out.println(data);
        System.out.println(Adapter.data.length);
    }

    public static void Update_Data() {
        CadastroUsuarioHash.listarUsuarios();

    }
}
