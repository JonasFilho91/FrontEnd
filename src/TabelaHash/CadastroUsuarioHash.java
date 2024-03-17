package TabelaHash;

import javax.swing.*;

public class CadastroUsuarioHash {

    public static void cadastrarUsuario(String nome, String cpf, String celular, String email) {
        if (Adapter.myTabHash.containsKey(cpf)) {
            System.out.println("CPF já cadastrado.");
            JOptionPane.showMessageDialog(null, "CPF já cadastrado.", "Cadastro Usuário", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Usuario novoUsuario = new Usuario(nome, cpf, celular, email);
            Adapter.myTabHash.put(cpf, novoUsuario);
            System.out.println("Usuário cadastrado com sucesso.");
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.", "Cadastro Usuário", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static boolean buscarUsuarioPorCPF(String cpf) {

        Usuario usuario = null;

        if (Adapter.myTabHash.containsKey(cpf)) {

            usuario = Adapter.myTabHash.get(cpf);

            Object[][] dadosBusca = new Object[1][4];

            System.out.println("Usuário encontrado: " + usuario.getNome() + ", CPF: " + usuario.getCpf() + ", Celular: " + usuario.getCelular() + ", Email: " + usuario.getEmail());

            dadosBusca[0][0] = usuario.getNome();
            dadosBusca[0][1] = usuario.getCpf();
            dadosBusca[0][2] = usuario.getCelular();
            dadosBusca[0][3] = usuario.getEmail();

            Adapter.setData(dadosBusca);
            return true;
        } else {
            System.out.println("Usuário não encontrado.");
            return false;
        }
    }

    public static boolean excluirUsuario(String cpf) {
        if (Adapter.myTabHash.containsKey(cpf)) {
            Adapter.myTabHash.remove(cpf);
            System.out.println("Usuário excluído com sucesso.");
            return true;
        } else {
            System.out.println("Usuário não encontrado.");
            return false;
        }
    }

    public static void listarUsuarios() {

        Object[][] data = new Object[Adapter.myTabHash.size()+1][4];
        if (Adapter.myTabHash.isEmpty()) {
            data[0][0] = "";
            data[0][1] = "";
            data[0][2] = "";
            data[0][3] = "";

            Adapter.setData(data);
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            int n = 0;
            for (Usuario usuario : Adapter.myTabHash.values()) {
                System.out.println("Nome: " + usuario.getNome() + ", CPF: " + usuario.getCpf() + ", Celular: " + usuario.getCelular() + ", Email: " + usuario.getEmail());
                data[n][0] = usuario.getNome();
                data[n][1] = usuario.getCpf();
                data[n][2] = usuario.getCelular();
                data[n][3] = usuario.getEmail();
                n++;
            }
        }Adapter.setData(data);
    }
}
