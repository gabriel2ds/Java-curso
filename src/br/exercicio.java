package br;

import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("informer um numero:");
        var n1 = scanner.nextInt();
        var keepverify = true;
        while(true){
            System.out.println("informe o numero pra verificarção:");
            var nn = scanner.nextInt();
            if(nn < n1) {
                System.out.printf("informe um numero maior que %s \n", n1);
                continue;
            }

            var result = nn % n1;
            keepverify = result == 0;
            System.out.printf("%s %% %s = %s\n",nn, n1, result);
            //se digitar um numero onde o resto é 1 então ele para o codigo(break)
           // if(result != 0){
           //     break;
           // }
        }

    }
}
