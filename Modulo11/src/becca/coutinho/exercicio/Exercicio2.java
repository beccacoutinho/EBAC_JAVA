package becca.coutinho.exercicio;

import java.util.*;

/**
 *  Ler do console nomes de homem e mulher (nome - H ; nome - F) e separar em uma lista por genero
 * */

public class Exercicio2 {
    public static void main(String args[]){
        separacaoGenero();
    }
    private static void separacaoGenero(){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite nomes e o sexo: ");
        String nomes = s.nextLine();

        String[] output = nomes.split(", ");


        List<String> lista1 = new ArrayList<String>();
        List<String> lista2 = new ArrayList<String>();


        for (int i = 0; i < output.length; i++){
            if (output[i].contains("M")){
                lista1.add(output[i]);
            } else{
                lista2.add(output[i]);
            }
        }

        Collections.sort(lista1);
        Collections.sort(lista2);

        System.out.println(lista1);
        System.out.println(lista2);
    }
}
