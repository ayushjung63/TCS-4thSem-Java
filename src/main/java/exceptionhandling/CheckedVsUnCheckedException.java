package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedVsUnCheckedException {
    public static void main(String[] args) {

        // all exception except RuntimeException and child of runtime exception are checked exception
        // RuntimeException and child of runtime exception are unchecked exception

        // checked exception :: need to be handled while writing the code
        // checked exception are forced by compiler to handle
        // FileNotFoundException

        File file=new File("/run/media/shady/784e7059-9470-4436-8f27-ebc96a44e0b8/shady/MyProjects/untitled1/src/main/java/abc.txt");
        try {
            // code where exception will occur
            FileInputStream fis = new FileInputStream(file);
            System.out.println("File is found");
        }catch (FileNotFoundException ex){ // the exeception that occurs
            // handling of exception
            // what to do when exception occurs
            System.out.println("File not found");
        }

        // unchecked exception are not forced by compiler

    }
}
