package bootcamp_java;

public class SerVivo {

    protected int idade;

    protected String nome;

    public SerVivo(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }


   // public abstract void respirar(); so funciona se a class servivo ficar abstract tbm

    public void dormir(){
        System.out.println("dormindo...");
    }
}
