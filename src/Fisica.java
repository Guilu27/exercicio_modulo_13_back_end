import java.util.Date;

public class Fisica extends Pessoa {
    String cpf;
    String dataNascimento;

    public void validarCpf() {
        if (this.cpf.length() == 14 || this.cpf.length() == 11) {
            System.out.println("O CPF é válido");
        } else {
            System.out.println("O CPF é inválido");
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Informações adicionais para Pessoa Física:");
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
    }

    public Fisica(String nome, String endereco, String telefone, String email, String cpf, String dataNascimento) {
        super(nome, endereco, telefone, email);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


}
