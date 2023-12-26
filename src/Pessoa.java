public abstract class Pessoa {
    String nome;
    String endereco;
    String telefone;
    String email;

    public void atulizarContato(String telefone, String email) {
        System.out.println("O telefone " + this.telefone + " foi atualizado para: " + telefone);
        System.out.println("O email " + this.email + " foi atualizado para: " + email);

        this.telefone = telefone;
        this.email = email;
    }

    public void exibirInformacoes() {
        System.out.println("Informações da Pessoa:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Email: " + this.email);
    }

    public Pessoa(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
