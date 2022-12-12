package becca.coutinho.exercício;

public class Programa {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setCpf("1");
        pessoaFisica.setNome("Rebecca1");
        pessoaFisica.setTrabalhador("desempregada");
        pessoaFisica.setEstudante("Estudante universitária");
        pessoaFisica.imprimirNome();
        pessoaFisica.imprimirCpf();
        pessoaFisica.imprimirTrabalhador();
        pessoaFisica.imprimirEstudante();


        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setCnpj("2");
        pessoaJuridica.setNome("Lanchonete Estrela");
        pessoaJuridica.setDireito("Direito Privado");
        pessoaJuridica.imprimirNome();
        pessoaJuridica.imprimirCnpj();
        pessoaJuridica.imprimirDireito();
    }

}
