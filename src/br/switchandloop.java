package br;

import java.util.ArrayList;
import java.util.Scanner;

public class switchandloop {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("digite um numero de 1 a 7");
        var option = scanner.nextInt();

        var mesg = switch (option){
           // case 1, 7 -> System.out.println("fim de semana");
            case 1, 7 -> {
                var day = option == 1? "domingo" : "sabado";
                yield String.format("hoje é %s, fim de semana", day);
            }
            case 2 -> "segunda";
            case 3 -> "terca";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            default -> "rapaz tu deixa de ser besta, viu!";
        };
        System.out.println(mesg);

        ArrayList<String> name = new ArrayList<>();
        name.add("leo");
        name.add("fernanda");
        name.add("jonas");
        name.add("jorge");
        System.out.println(name.get(0));

        //remover
        name.remove(0);
        System.out.println(name.get(0));
        name.remove("fernanda");
        System.out.println(name.get(0));

        //LOOP FOR
        //   var de interação; condicional; atribuição
        for (int i = 0; i < name.size(); i++){
            System.out.println(name.get(i));
        }

        //VETORES
        int[] colecDeInteiros = {12,3,4};
        System.out.println(colecDeInteiros.length);

        //É UM ESPAÇO LIMITADO, ENTÃO QUANDO N SOUBER O TAMANHO, USE ARRAYLIST
        String[] nomesarr = new String[10];
        nomesarr[0] = "fernanda";
        nomesarr[1] = "miguel";

        for(int j = 0; j <nomesarr.length; j++){
            System.out.println(nomesarr[j]);
        }

        //o String nome-> Crie uma variável chamada nome que vai receber uma String
        for(String nome : nomesarr){
            System.out.println(nome);
        }

        //while-> executado até que uma condição seja atingida
        int contador = 0;
        while(contador < 10){
            System.out.println("estou no while");
            contador++;
        }
        //no python tem true while() no java é while(true){} -> serve pra fazer loops de lista e essas coisas

        //sabemos q quando declaramos um var ela tem esse mesmo tipo pra sempre, mais também sabemos que
        //vai ter vezes que precisamos trocar ela e ai entra o CASTINGS
        //que transforma por ex string em inteiro

        //casting explicito:
        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        int meuInt = 10;
        double meuDouble = meuInt;

        //casting implicito:
        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        String MinhaString = String.valueOf(meuInt2);


    }
}
