package TabelaHash;

import java.util.Map;

public class CadastroUsuarioHash {
    public static boolean cadastrarUsuario(Map<String, Usuario> usuarioMap, String nome, String cpf, String celular, String email) {
        if (usuarioMap.containsKey(cpf)) {
            System.out.println("CPF já cadastrado.");
            return false;
        } else {
            Usuario novoUsuario = new Usuario(nome, cpf, celular, email);
            usuarioMap.put(cpf, novoUsuario);
            System.out.println("Usuário cadastrado com sucesso.");
            return true;
        }
    }
    public static Object buscarUsuarioPorCPF(Map<String, Usuario> usuarioMap, String cpf) {
        Usuario usuario = null;
        if (usuarioMap.containsKey(cpf)) {
            usuario = usuarioMap.get(cpf);
            System.out.println("Usuário encontrado: " + usuario.getNome() + ", CPF: " + usuario.getCpf() + ", Celular: " + usuario.getCelular() + ", Email: " + usuario.getEmail());
            return usuario;
        } else {
            System.out.println("Usuário não encontrado.");
            return usuario;
        }
    }

    public static boolean excluirUsuario(Map<String, CadastroUsuario> usuarioMap, String cpf) {
        if (usuarioMap.containsKey(cpf)) {
            usuarioMap.remove(cpf);
            System.out.println("Usuário excluído com sucesso.");
            return true;
        } else {
            System.out.println("Usuário não encontrado.");
            return false;
        }
    }

    public static Object[][] listarUsuarios(Map<String, Usuario> usuarioMap) {
        Object[][] data = new Object[usuarioMap.size()][4];
        if (usuarioMap.isEmpty()) {
            data[0][0] = "";
            System.out.println("Nenhum usuário cadastrado.");
            return data;
        } else {
            int n = 0;
            for (Usuario usuario : usuarioMap.values()) {
                System.out.println("Nome: " + usuario.getNome() + ", CPF: " + usuario.getCpf() + ", Celular: " + usuario.getCelular() + ", Email: " + usuario.getEmail());
                data[n][0] = usuario.getNome();
                data[n][1] = usuario.getCpf();
                data[n][2] = usuario.getCelular();
                data[n][3] = usuario.getEmail();
                n++;
            }
        }
        return data;
    }
}
