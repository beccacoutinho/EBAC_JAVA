package becca.coutinho.abstratas;

public class Assalariado  extends Empregado{

    private  Double salario;

    public Double getSalario(){
        return salario;
    }

    @Override
    public Double vencimento() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
