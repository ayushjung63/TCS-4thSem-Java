package interfaces;

public interface Code {
    void letsCode();

    // we can write method body in interface
    // 1 Interface -> implement by 100 class

    default void letsCode2(){
        // impl
        System.out.println("letsCode2");
    }
}
