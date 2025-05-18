package exceptionhandling;

public class ExceptionMain {
    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            // lets say kei exception aayo when printing no 5
            if (i==5) {
                throw new ArithmeticException();
            }
            System.out.println("Number is:: "+i);
        }
    }
}
