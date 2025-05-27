package generics;

public class PrintMain {
    public static void main(String[] args) {
        Print<Integer> p=new Print<Integer>();
        p.print(1);

        Print<String> p2=new Print<String>();
        p2.print("Hello World");
        
        // cannot use primitive data type in generics
        // we use Wrapper class for this
       // Print<int> p5=new Print<int>();
    }
}
