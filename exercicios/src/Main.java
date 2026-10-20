import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");//usado para quebrar linha quando usar scanner "doguinho caramelo"
        var option = -1;
        do{
         System.out.println("escolha uma das opções:");
         System.out.println("=======================");
         System.out.println("1 - banhar pet");
         System.out.println("2 - abastecer máquina com água");
         System.out.println("3 - abastecer máquina com shampoo");
         System.out.println("4 - verificar água da maquina");
         System.out.println("5 - verificar shampoo da maquina");
         System.out.println("6 - verificar se tem pet no banho");
         System.out.println("7 - colocar pet na máquina");
         System.out.println("8 - retirar pet da máquina");
         System.out.println("9 - limpar máquina");
         System.out.println("0 - sair");
         System.out.println("escolha uma das opções:");
         option = scanner.nextInt();

         switch (option){
             case 1 -> petMachine.takeAShower();
             case 2 -> setWater();
             case 3 -> setshampoo();
             case 4 -> verifyWater();
             case 5 -> verifyShampoo();
             case 6 -> CheckPetHasMachine();
             case 7 -> setPetInPetMachine();
             case 8 -> petMachine.removePet();
             case 9 -> petMachine.WashMachine();
             case 0 -> System.exit(0);
             default -> System.out.println("digite um numero");
         }
        }while (true);
    }

    private static void setshampoo(){
        System.out.println("tentando colocar shampoo na maquina");
        petMachine.addShampoo();
    }

    private static void setWater(){
        System.out.println("tentando colocar agua na maquina");
        petMachine.addWater();
    }

    private static void verifyWater() {
        var amout = petMachine.getWater();
        System.out.println("a máquina está no momento com " + amout + " litros de  água");
    }

    private static void verifyShampoo() {
        var amout = petMachine.getShampoo();
        System.out.println("a máquina está no momento com " + amout + " litros de  shampoo");
    }

    private static void CheckPetHasMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "tem pet na maquina" : "não tem pet na maquina");
    }

    public static void setPetInPetMachine(){
        var name = "";
        while(name == null || name.isEmpty()){//enquanto o usuario n dizer o nome do pet ele vai loopar
            System.out.println("informe o nome do pet:");
            name = scanner.next();
        }
        var  pet = new Pet(name);
        petMachine.setPet(pet);

    }

}
