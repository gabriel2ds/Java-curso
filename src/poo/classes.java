package poo;

import java.util.Scanner;

public class classes {
    public static void main(String[] args) {
        var male = new Person("gabriel");
        male.incAge();
        var female = new Person("maria");
        female.incAge();

        System.out.println("male name: " + male.getName()+ " " + male.getAge());
        System.out.println("female name: " + female.getName()+ " " + female.getAge());
    }
}
