 package TabelaHash;

import java.util.Map;

 /**
 * Um programa simples para cadastrar e buscar informações dos usuários usando uma tabela hash.
 */
public class CadastroUsuario {

    public static class Usuario {
        private String nome;
        private String cpf;
        private String celular;
        private String email;

        public Usuario(String nome, String cpf, String celular, String email) {
            this.nome = nome;
            this.cpf = cpf;
            this.celular = celular;
            this.email = email;
        }

        public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }

        public String getCelular() {
            return celular;
        }

        public String getEmail() {
            return email;
        }
    }
    public static void cadastrarUsuario(Map<String, Usuario> usuarioMap, String nome, String cpf, String celular, String email) {
        if (usuarioMap.containsKey(cpf)) {
            System.out.println("CPF já cadastrado.");
        } else {
            Usuario novoUsuario = new Usuario(nome, cpf, celular, email);
            usuarioMap.put(cpf, novoUsuario);
            System.out.println("Usuário cadastrado com sucesso.");
        }
    }

    public static void buscarUsuarioPorNome(Map<String, Usuario> usuarioMap, String nome) {
        boolean encontrado = false;
        for (Usuario usuario : usuarioMap.values()) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome encontrado: " + nome + ", CPF: " + usuario.getCpf() + ", Celular: " + usuario.getCelular() + ", Email: " + usuario.getEmail());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nome não encontrado.");
        }
    }

    public static void buscarUsuarioPorCPF(Map<String, Usuario> usuarioMap, String cpf) {
        if (usuarioMap.containsKey(cpf)) {
            Usuario usuario = usuarioMap.get(cpf);
            System.out.println("Usuário encontrado: " + usuario.getNome() + ", CPF: " + usuario.getCpf() + ", Celular: " + usuario.getCelular() + ", Email: " + usuario.getEmail());
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    public static void excluirUsuario(Map<String, Usuario> usuarioMap, String cpf) {
        if (usuarioMap.containsKey(cpf)) {
            usuarioMap.remove(cpf);
            System.out.println("Usuário excluído com sucesso.");
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    public static void listarUsuarios(Map<String, Usuario> usuarioMap) {

        if (usuarioMap.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (Usuario usuario : usuarioMap.values()) {
                System.out.println("Nome: " + usuario.getNome() + ", CPF: " + usuario.getCpf() + ", Celular: " + usuario.getCelular() + ", Email: " + usuario.getEmail());

            }
        }
    }
}