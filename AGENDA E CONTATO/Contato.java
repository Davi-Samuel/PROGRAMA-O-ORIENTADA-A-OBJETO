public class Contato {
    private String nome;
    private String telefone;
    private String email; 

    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void imprimirInformacoes() {
        System.out.println("_nome: " + this.nome);
        System.out.println("_email: " + this.email);
        System.out.println("_telefone: " + this.telefone);
    }
    
}
