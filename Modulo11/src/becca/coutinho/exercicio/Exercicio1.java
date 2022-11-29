package becca.coutinho.exercicio;

import java.util.*;

/***
 * Ler do console nomes separados por vírgula, armazenar e depois mostrar em ordem alfabetica
 */

public class Exercicio1 {
    public static void main(String args[]){
        listaOrdenada();
    }
        private static void listaOrdenada() {
            Scanner s = new Scanner(System.in);


            System.out.println("Digite quatro nomes: ");
            String nomes = s.nextLine();

            String[] output = nomes.split(", ");

            String nome1 = output[0];
            String nome2 = output[1];
            String nome3 = output[2];
            String nome4 = output[3];

            List<String> lista = new ArrayList<String>();
            lista.add(nome1);
            lista.add(nome2);
            lista.add(nome3);
            lista.add(nome4);
            Collections.sort(lista);
            System.out.println(lista);
            System.out.println("");
        }

}
