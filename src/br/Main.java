package br;

import java.util.Scanner;
// pra pegar todo o import:
// import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private final static String Welcome_message = "digite seu nome:";
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
        //CompletableFuture; // nao funciona pois mesmo estando no package util ele está em outro package que esta dentro do util
        //Scanner scanner = new Scanner(System.in);
        var scanner = new Scanner(System.in);
        System.out.println(Welcome_message);
        //String nome = scanner.next();
        var nome = scanner.next();
        System.out.println("digite sua idade:");
        int idade = scanner.nextInt();
        //System.out.println("olá "+ nome +" sua idade é " + idade);
        System.out.printf("olá %s sua idade é %s anos \n", nome, idade);
        /*
        * diferença entre print e println
        * o print é normal e tem a mesma função do println
        * o println printa na tela e logo em seguida quebra linha \n
        * o printf nao quebra linha ent tem q colocar o \n
        * */

    }
}