package abstractclass;

/*
* abstract class need to be extended by other class
* we cannot create object of abstract class
* */
public abstract class AllStudent {

    // both abstract and non-abstract methods

    // non-abstract method
    public void studyCreditSubject(){
        System.out.println("All Student study credit subject");
    }

    // abstract method
    public abstract void studyNonCreditSubject();
}
