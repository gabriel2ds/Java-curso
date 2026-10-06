package br;

import java.util.ArrayList;
import java.util.Scanner;

public class condicao {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("digite sua idade:");
        var idade = scanner.nextInt();

        if (idade >=18) {
            System.out.println("voce é maior de idade");

        }//não precisamos das {} pq é apenas uma linha mais, se fosse usar mais linha necessita-se das {}
        else System.out.println("menor de idade");

        //operador ternário
        var msg = idade >=18?"pode dirigir": "não pode dirigir";
        System.out.println(msg);
        //VETORES
        int[] colecDeInteiros = {12,3,4};
        System.out.println(colecDeInteiros.length);

       //É UM ESPAÇO LIMITADO, ENTÃO QUANDO N SOUBER O TAMANHO, USE ARRAYLIST
        String[] nomesarr = new String[10];
        nomesarr[0] = "fernanda";
        nomesarr[1] = "miguel";


       //arraylist

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

        //adicionando indices no final, no meio e no inicio da lista
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        //{10,20,30}

        lista.add(0, 5);   // adiciona no índice 0
        lista.add(15);                   // adiciona no final
        lista.add(2, 15);  // adiciona no índice 2
        lista.set(1, 50); //altera o indice 1 pra 50
        //{5,50,15,20,30,15}
        System.out.println(lista);

    }
}
