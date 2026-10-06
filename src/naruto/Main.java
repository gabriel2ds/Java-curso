package naruto;

public class Main {
    public static void main(String[] args) {
        //objeto 1
        uzumaki naruto = new uzumaki();
        naruto.nome = "gabriel";
        naruto.aldeia = "Folha";
        System.out.println(naruto.nome);
        naruto.chakraInfinto();
        naruto.TemBijuu = true;


        //objeto 2
        //Ninja Sasuke = new Ninja();
        //Sasuke.nome = "sasuke uchiha";
        //Sasuke.aldeia= "folha";
        //Sasuke.shariganAtivado();

        uchiha sasuke = new uchiha();
        sasuke.nome = "sasuke";
        sasuke.ShariganAtivado();

    }
}
