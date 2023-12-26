public class Main {

    public static void main(String[] args) {
        System.out.println("-----Pessoa Fisica-----");
        Fisica fisica = new Fisica("Thomas Severino Jorge Ferreira", "Rua 9, 998, Boa Vista, Anápolis - GO",
                "(62) 98347-1421", "thomas_ferreira@portoweb.com.br", "143.346.710-04", "22/08/1988");

        fisica.validarCpf();
        fisica.setCpf("143.346710-04");
        fisica.validarCpf();
        fisica.setCpf("14334671004");
        fisica.validarCpf();
        fisica.setCpf("1433467104");
        fisica.validarCpf();
        System.out.println("----------------------------------");

        fisica.exibirInformacoes();
        System.out.println("----------------------------------");

        fisica.atulizarContato("(62) 2929-0350", "thomas_ferreira@gmail.com");
        System.out.println("----------------------------------");

        fisica.exibirInformacoes();

        System.out.println("-----Pessoa Juridica-----");
        Juridica juridica = new Juridica("OL Ferragens", "Rua Joel Teixeira de Souza, 893, Mombaça, Pindamonhangaba - SP",
                "(12) 2788-4246", "auditoria@otavioeleviferragensltda.com.br",
                "01.734.967/0001-60", "OL Ferragens Ltda");

        juridica.validarCnpj();
        juridica.setCnpj("01.734.967/000-60");
        juridica.validarCnpj();
        juridica.setCnpj("01734967000160");
        juridica.validarCnpj();
        juridica.setCnpj("0173496700160");
        juridica.validarCnpj();
        System.out.println("----------------------------------");

        juridica.exibirInformacoes();
        System.out.println("----------------------------------");

        juridica.atulizarContato("(12) 99772-7181", "auditoria@olferragens.com.br");
        System.out.println("----------------------------------");

        juridica.exibirInformacoes();
    }
}
