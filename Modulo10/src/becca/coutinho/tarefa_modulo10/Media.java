package becca.coutinho.tarefa_modulo10;

import java.util.Scanner;

public class Media {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int nota1 = s.nextInt();

        System.out.println("\nDigite a segunda nota: ");
        int nota2 = s.nextInt();

        System.out.println("\nDigite a terceira nota: ");
        int nota3 = s.nextInt();

        System.out.println("\nDigite a quarta nota: ");
        int nota4 = s.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) /4;

        if (media >=7) {
            System.out.println( "Você teve a média " + media + ". Parabéns!! Foi aprovado." );
        } else if (media >=5 ) {
            System.out.println( "Você teve a média " + media + ". Está de recuperação;" );
        } else {
            System.out.println( "Você teve a média " + media + ". Está de reprovado;" );
        }

    }
}
