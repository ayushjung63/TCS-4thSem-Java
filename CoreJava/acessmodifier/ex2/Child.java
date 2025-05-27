package acessmodifier.ex2;

import acessmodifier.ex1.Person;

public class Child extends Person {

    public void accessProtected(){
        System.out.println(this.contact);
    }
}
