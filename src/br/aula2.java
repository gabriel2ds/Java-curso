package br;

import java.util.Scanner;

public class aula2 {
    public static void main(String[] args) {
       long idade = 19;
       //System.out.println(((Object) idade).getClass());

        var scanner = new Scanner(System.in);

        System.out.println("digite um numero:");
        var n1 = scanner.nextInt();
        System.out.println("digite outro numero:");
        var n2 = scanner.nextInt();
        System.out.printf("%s * %s = %s", n1, n2, n1 % n2);

    }
}
