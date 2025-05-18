package functional;

class JavaCode implements Code{
    @Override
    public void letsCode() {
        System.out.println("Lets code in Java using Concrete class");
    }
}

class NodeCode implements Code{
    @Override
    public void letsCode() {
        System.out.println("Lets code in Node");
    }
}

public class Main {
    public static void main(String[] args) {

        Code javaCode1 = new JavaCode();
        javaCode1.letsCode();

        Code javaCode= new Code() {
            @Override
            public void letsCode() {
                System.out.println("Lets code in Java using Anonymous class");
            }
        };
        javaCode.letsCode();

        Code javaCode2= () -> System.out.println("Lets code in Java using Lambda Expression");
        javaCode2.letsCode();
        
    }
}
