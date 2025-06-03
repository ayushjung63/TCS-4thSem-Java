package CoreJava.dependencyinjection;

public class Bike {
    private Tyre tyre;

    public Bike(Tyre tyre) {
        this.tyre = tyre;
    }

    public void ride(){
        System.out.println("I am riding with Tyre : " + tyre.getBrand());
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
}
