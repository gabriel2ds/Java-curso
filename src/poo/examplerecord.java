package poo;

public class examplerecord {
    public static void main(String[] args) {
        var person = new recordppo("Gabriel", 19);
        var person1 = new recordppo("gabriel", 12);

        System.out.println(person);
        System.out.println(person.name());
        System.out.println(person1.getInfo());
    }

}
