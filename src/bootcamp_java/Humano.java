package bootcamp_java;

public class Humano extends SerVivo{//herda tudo de ser vivo

        //String nome;
    public Humano(){
        super("gabriel", 42);
        //this.nome = "Gabriel";
    }

 //   @Override ->  so se ficar abstract
    public void respirar() {
        System.out.println("nome " + this.nome + " idade " + this.idade);
        System.out.println("inalando oxigenio e exalando CO2");
    }
}
