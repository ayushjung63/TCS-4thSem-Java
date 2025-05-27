package abstractclass;

public class AbstractMain {
    public static void main(String[] args) {
        // cannot create object of abstract class
        // need to use its child class to create the object
        AllStudent student=new TCS4thSemStudent();
        student.studyCreditSubject();
        student.studyNonCreditSubject();
    }
}
