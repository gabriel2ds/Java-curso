package br;

public class bit {
    public static void main(String[] args) {
        var value1 = 8;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("primeiro numero da operação %s (representação binária %s)\n", value1, binary1);
        var value2 = 2;
        var binary2 = Integer.toBinaryString((value2));
        System.out.printf("segundo numero da operação %s (representação binária %s)\n", value2, binary2);
        var result = value1 >> value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s | %s = %s (representação binaria %s)\n",value1, value2, result, binaryResult);
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));

        /*
        1 -> true
        0 -> false
        * 6 = 1 | 1 | 0
        * 5 = 1 | 0 | 1
        * 7 = 1   1   1
        *
        << -> ele serve pra deslocar os bits pra esquerda ex: 6 << 2 6= 110 ai desloca duas casas fica 11000
        >> -> mesma função ao so q ao invez de add ele deleta 8 >> 2 8 = 1000 deloca 2 casas fica 0010
        */
    }
}
