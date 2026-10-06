package bootcamp_java;

public class sandero implements Carrao {

    final int VelMax = 150;
    int VelAtual = 0;
    @Override
    public void acelerar() {
        if(this.VelAtual < VelMax) {
            this.VelAtual += 50;
            System.out.println("acelerando...");
            System.out.println("velocidade atual de" + this.VelAtual);
        }
        else {
            System.out.println("o limite do carro é apenas de" + this.VelMax);
        }
    }

    @Override//sobresceve oq vem do carrao
    public void freiar() {

    }

    @Override
    public void parar() {

    }
}
