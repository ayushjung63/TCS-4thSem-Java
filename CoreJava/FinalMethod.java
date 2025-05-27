
class Parent{
    public final void hello(){
        System.out.println("Namaste");
    }
}

class Child extends Parent{

}


public class FinalMethod {
    public static void main(String[] args) {
        Child child = new Child();
        child.hello();
    }
}
