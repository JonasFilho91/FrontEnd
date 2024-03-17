package TabelaHash;

public class Usuario{
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
