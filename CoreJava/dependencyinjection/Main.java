package CoreJava.dependencyinjection;

public class Main {
    public static void main(String[] args) {
        Tyre mrfTyre = new Tyre("MRF");
        Bike bike=new Bike(mrfTyre); // constructor injection
        bike.ride();

        Tyre tvsTyre = new Tyre("TVS");
        bike.setTyre(tvsTyre); // setter injection
        bike.ride();

    }
}
