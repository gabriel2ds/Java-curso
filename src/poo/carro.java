package poo;

public class carro {

    String modelo;

    public static void main(String[] args){
        System.out.println("testeee");
    }

    //o meu (paramentro-> string modelo [new carro]) modelo( do this.modelo) vai receber oq eu recebo do modelo (string modelo)
    //this.modelo-> atributo de classe / string modelo; -> parâmetro
    public carro(String modelo) {
        this.modelo = modelo;
    }


    //declarando metodo
    //private n permite chamar em outro arquivo so fica no arquivo onde a class ta
    //private -> acessivel somente dentro da classe que foi definido
    //public _> acessivel de todo lugar
    //protected -> acessivel por todo mundo que está no mesmo pacote(class)
    //defaulta -> quando eu n defino, ele segue esse daqui
    public String acelerar() {
        System.out.println("acelerando carro " + this.modelo);
        return "oi";
    }


    public String test() {
        System.out.println("oiiiii o carro" + this.modelo);
        //o acelerar funciona pois é private e o private funciona no mesmo arquivo
        //this.acelerar();
        return "oi";
    }
}
class rodas{
    public rodas(){
        carro Carro = new carro("testando aq");
        Carro.acelerar();
    }

    public static void main(String[] args) {
        carro Carro= new carro ("fusca");
        Carro.acelerar();
    }
}

//interfaces e classe abstratas

