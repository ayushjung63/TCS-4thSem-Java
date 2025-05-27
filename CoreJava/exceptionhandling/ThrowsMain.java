package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsMain {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        try {
            method2();
        } catch (FileNotFoundException ex) { // the exeception that occurs
            // handling of exception
            // what to do when exception occurs
            System.out.println("File not found");
        }
    }

    /*
     * method 2 can either handle the exception using try-catch
     * or it can throw the method using throws to the calling class/method
     * */
    public static void method2() throws FileNotFoundException {
        File file = new File("/run/media/shady/784e7059-9470-4436-8f27-ebc96a44e0b8/shady/MyProjects/untitled1/src/main/java/abc.txt");
        FileInputStream fis = new FileInputStream(file);
    }
}
