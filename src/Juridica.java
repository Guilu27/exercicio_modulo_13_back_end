public class Juridica extends Pessoa {
    String cnpj;
    String razaoSocial;

    public void validarCnpj() {
        if (this.cnpj.length() == 18 || this.cnpj.length() == 14) {
            System.out.println("O CNPJ é válido");
        } else {
            System.out.println("O CNPJ é inválido");
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Informações adicionais para Pessoa Jurídica:");
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Razão Social: " + this.razaoSocial);
    }

    public Juridica(String nome, String endereco, String telefone, String email, String cnpj, String razaoSocial) {
        super(nome, endereco, telefone, email);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
