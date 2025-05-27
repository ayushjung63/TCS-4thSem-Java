package exceptionhandling;

public class TryCatch1 {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;
        try {
            int result = num1 / num2;
            System.out.println("Result :: " + result);
        }catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by zero");
        }
    }
}
