package br;

import java.util.Scanner;

public class loopcompleto {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        for(;;){
            System.out.println("digite seu nome:");
            var name = scanner.next();

            //o equalsIgnoreCase é como se fosse o .lower e .upper do python se digitar exit vai dar certo
            //mesmo se for EXIT ainda da crt
            if(name.equalsIgnoreCase("exit")) break;

            System.out.println(name);
        }
        //pra digitar impares(i%2==0) até o 100(99)
        for(var i = 0; i <args.length; i++){
            System.out.println((i + 1)+ " - " + args[i]);
        } //ou
        for(var arg : args){
            System.out.println(arg);
        }


        //WHILE

       // var name = "";
       // while(!name.equals("exit")){
       //     System.out.println("digte um nome:");
       //     name = scanner.next();
       //     System.out.println(name);
       // }
        var name = "";
        while(true){
            System.out.println("digte um nome:");
            name = scanner.next();
            System.out.println(name);

            if(name.equalsIgnoreCase("exit")) break;
        }

        //do while
        var nome = "exit";
        do{
            System.out.println("digte um nome:");
            nome = scanner.next();
            System.out.println(nome);

           // if(nome.equalsIgnoreCase("exit")) break;
        }while(!nome.equalsIgnoreCase("exit"));
    }
}
