package exceptionhandling;

public class Practice {

    public void validateAge(int age) {
        if (age < 20) {
            throw new AgeNotValidException("Age must be greater than 20");
        }else{
            System.out.println("Age is valid");
        }
    }

    public static void main(String[] args) {
        Practice practice = new Practice();
        try {
            practice.validateAge(18);
        }catch (AgeNotValidException e) {
            System.out.println(e.getMessage());
        }

        practice.validateAge(30);
    }
}
