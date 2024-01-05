package edu.ebac;

import java.util.Scanner;

/**
 * @author vinisantosn
 */
public class Main {

    public static void main(String[] args) {
        getMediaDeQuatroNotas();
    }

    public static void getMediaDeQuatroNotas(){
        double notaUm;
        double notaDois;
        double notaTres;
        double notaQuatro;
        double media;

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        notaUm = scan.nextDouble();
        System.out.println("Insira a segunda nota: ");
        notaDois = scan.nextDouble();
        System.out.println("Insira a terceira nota: ");
        notaTres = scan.nextDouble();
        System.out.println("Insira a quarta nota: ");
        notaQuatro = scan.nextDouble();

        media = (notaUm+notaDois+notaTres+notaQuatro)/4;

        System.out.println("A média das quatro notas inseridas é: " + media);
    }


}