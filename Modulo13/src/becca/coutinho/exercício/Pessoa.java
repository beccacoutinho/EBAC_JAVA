package becca.coutinho.exercício;

public abstract class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void imprimirNome(){
        System.out.println("O nome é " + this.nome);
    }

}
