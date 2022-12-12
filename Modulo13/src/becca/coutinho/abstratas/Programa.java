package becca.coutinho.abstratas;

public class Programa {

    public static void main(String args[]){
        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Rebecca1");
        empregado.setSobrenome("Coutinho");
        empregado.setSalario(100d);
        imprimir(empregado);

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2");
        comissionado.setNome("Rebecca2");
        comissionado.setSobrenome("Coutinho");
        comissionado.setTotalVenda(2000d);
        comissionado.setTotalComissao(0.1d);
        imprimir(comissionado);

        Horista horista = new Horista();
        horista.setCpf("3");
        horista.setNome("Rebecca3");
        horista.setSobrenome("Coutinho");
        horista.setPrecoHora(1000d);
        horista.setTotalHoraTrabalhada(60d);
        imprimir(horista);

    }

    public static void imprimir(Empregado empregado){
        empregado.imprimirSobrenome();
        empregado.imprimirValores();
        System.out.println( empregado.getNome() + " tem o salário de: " + empregado.vencimento());
    }
}
