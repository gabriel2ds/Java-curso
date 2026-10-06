public class Pet {


    private final String name;

    private boolean clean;


    //nessa idle se vc apertar fn+ insert vc abre um construtor pra vc

    public Pet(String name) {
        this.name = name;
        this.clean = false;
    }

    public String getName() {
        return name;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}
