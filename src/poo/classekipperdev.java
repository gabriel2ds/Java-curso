package poo;

public class classekipperdev {

    public static void test(){
        System.out.println("testeee");
    }
    public static void main(String[] args) {
    //metodo construtor
        //instanca de novos objeto (news)
        carro meuCarro = new carro("fusca");
        carro meuCarro1 = new carro("porsche");
        carro meuCarro2 = new carro("jeep");

        //o acelerar n ta funcionando pq ele ficou private e o private so funciona no mesmo arquivo
        String result = meuCarro.acelerar();
        meuCarro1.acelerar();
        meuCarro2.acelerar();
        System.out.println(meuCarro.acelerar());
        System.out.println(result);
        test();


    }
}
