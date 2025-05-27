package exceptionhandling;

public class FinallyMain {
    public static void main(String[] args) {
       try {
           throw new AgeNotValidException("Age not valid");
//           System.out.println("Hello World");
       }catch (Exception e) {
           System.out.println("Caught Exception");
       }finally {
           System.out.println("Finally");
       }
    }
}









/*
* Create a new class with method validateAge,
* create new exception class , check if age is less than 20
* if age is less than 20 throw exception else print age is valid
*
* */





