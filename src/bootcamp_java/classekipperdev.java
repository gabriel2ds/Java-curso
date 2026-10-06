package bootcamp_java;

import poo.carro;

public class classekipperdev {

    public static void test(){
        System.out.println("testeee");
    }
    public static void main(String[] args) {
    //metodo construtor
        //instanca de novos objeto (news)
        Carrao meuCarro = new sandero();
        Carrao meuCarro1 = new mobi();
        //ServVivo human = new Humano();
        Humano human = new Humano();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        human.respirar();
        test();
        carro meuCarroFurado = null;

        try{
            meuCarroFurado.acelerar();
        }catch (NullPointerException exception){
            System.out.println("vende carro furado");
        }


    }
}
