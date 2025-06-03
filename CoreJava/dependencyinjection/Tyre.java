package CoreJava.dependencyinjection;

public class Tyre {
    private String brand;

    public Tyre(){}

    public Tyre(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
