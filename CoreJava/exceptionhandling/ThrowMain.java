package exceptionhandling;

public class ThrowMain {
    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            try {
                if (i == 5) {
                    throw new AgeNotValidException("5 is not allowed");
                }
                System.out.println(i);
            }catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
