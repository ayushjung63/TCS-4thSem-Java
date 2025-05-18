package generics;

public class WrapperMain {
    int num;
    Integer num2;

    Float num3;
    float num4;

    boolean bool;
    Boolean bool2;

    public static void main(String[] args) {
        WrapperMain wrapperMain = new WrapperMain();
        wrapperMain.print();
    }

    public void print(){
        System.out.println("int :: " + num);
        System.out.println("Integer :: " + num2);

        System.out.println("float :: " + num4);
        System.out.println("Float :: " + num3);

        System.out.println("boolean :: " + bool);
        System.out.println("Boolean :: " + bool2);
    }
}
