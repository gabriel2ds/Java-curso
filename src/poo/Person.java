package poo;

import java.time.OffsetDateTime;

public class Person {

    /*
    //metodos estaticos não tem acesso ao this.
    public static String teste(){
        return "teste";
    }
    private static String test;

    //se quiser usar o name, nao sera possivel pois metodos static so usam outros static
    public static void setTest(String testParam){
        test = testParam;
    }
    public static String getTest(){
        return test;
    }
    */

    //final ta definindo como uma constante
    private final String name;

    private int age;

    public String getName(){
        return name;
    }

    private int LasrYearAgeInc = OffsetDateTime.now().getYear() -1;

    public void incAge(){
        if (this.LasrYearAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age += 1;
        this.LasrYearAgeInc = OffsetDateTime.now().getYear();
    }


    public Person(String name){
        this.name = name;
        this.age = 1;
    }


    public int getAge(){
        return age;
    }

}
