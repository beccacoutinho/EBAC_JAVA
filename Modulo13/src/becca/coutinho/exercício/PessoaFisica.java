package becca.coutinho.exercício;

public class PessoaFisica extends Pessoa{

    private String cpf;

    private String trabalhador;

    private String estudante;

    public void imprimirCpf(){
        System.out.println("Seu cpf é " + this.cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTrabalhador() {
        return trabalhador;
    }

    public void setTrabalhador(String trabalhador) {
        this.trabalhador = trabalhador;
    }

    public String getEstudante() {
        return estudante;
    }

    public void setEstudante(String estudante) {
        this.estudante = estudante;
    }

    public void imprimirEstudante(){
        System.out.println( getNome() + " é uma " + this.estudante);
    }

    public void imprimirTrabalhador(){
        System.out.println( getNome() + " está " + this.trabalhador);
    }
}
