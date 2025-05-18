package generics;

public class GenericMain {
    public static void main(String[] args) {
        GenericMain genericMain = new GenericMain();
//        genericMain.printInteger(22);
//        genericMain.printDouble(10.22);
//        genericMain.printString("Hello World");

        System.out.println("Print using Generics ");
        genericMain.print(22);
        genericMain.print(10.22);
        genericMain.print("Hello World");
    }


        public <T> void print(T number) {
            System.out.println(number);
        }

//    public void printInteger(int number) {
//        System.out.println(number);
//    }
//
//    public void printString(String data) {
//        System.out.println(data);
//    }
//
//    public void printDouble(Double data) {
//        System.out.println(data);
//    }
}
