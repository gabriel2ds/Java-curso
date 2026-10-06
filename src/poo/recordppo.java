package poo;

public record recordppo(String name, int age){
        //no record so é permitido atribuir atributos estáticos
        //public static String name;
    public recordppo{
        System.out.println("========");
        System.out.println(name);
        System.out.println(age);
        System.out.println("========");
    }

    public recordppo(String name){
        this(name, 0);
    }

    public String getInfo(){
        return "Name: " +name + " age " + age;
    }
}
