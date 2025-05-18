package polymorphism;

public class MethodOverloadingExample {
    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();
        example.add(1,2);
        example.add(1,2,3);
        example.add(1,2,3,4);


        // method overring main
        Parent parent = new Parent();
        parent.hello(); // parent impl print

        Child child = new Child();
        child.hello(); // child impl print
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
    public void add(int a, int b,int c) {
        System.out.println(a + b + c);
    }
    public void add(int a, int b, int c,int d) {
        System.out.println(a + b + c + d);
    }

}
