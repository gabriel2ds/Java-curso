public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;


    public void takeAShower(){
        if(this.pet == null){
            System.out.println("coloque o pet na máquina para iniciar o banho!");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("o pet " + pet.getName() +" está limpo ");
    }

    public void addWater(){
        if(water == 30){
            System.out.println("capacidade de água no limite!!");
            return;
        }

        water += 2;
    }
    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("capacidade de shampoo, no limite!!");
            return;
        }

        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("maquina está suja, limpar maquina pra depois colocar pet.");
            return;
        }
        if(hasPet()){
            System.out.println("o pet " + this.pet.getName() + "está na maquina agora");
            return;
        }

        this.pet = pet;
        System.out.println("o pet " + pet.getName() + " foi colocado na maquina!");
    }

    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("o pet " + this.pet.getName() + " está banhado e limpo");
        this.pet = null;
    }

    public void WashMachine(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("a maquina está limpa");
    }
}
