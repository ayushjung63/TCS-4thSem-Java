package scope;

public class VariableScope {

    // instance variable or class level variable
    int num=5;

    public static void main(String[] args) {

    }

    public void method1(String name) {
        int x=10;
        System.out.println(x);
        System.out.println(name);
        System.out.println(num);
    }

    // method scope // method level variable
    public void method2(){
        int y=11;
        System.out.println(y);
        System.out.println(num);
    }
}
