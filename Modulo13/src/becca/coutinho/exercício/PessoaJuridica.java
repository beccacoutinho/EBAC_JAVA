package becca.coutinho.exercício;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    private String direito;

    public String getCnpj() {
        return cnpj;
    }

    public void imprimirCnpj(){
        System.out.println("Seu cnpj é " + this.cnpj);
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDireito() {
        return direito;
    }

    public void setDireito(String direito) {
        this.direito = direito;
    }

    public void imprimirDireito(){
        System.out.println( getNome() + " é uma empresa de " + this.direito);
    }
}
