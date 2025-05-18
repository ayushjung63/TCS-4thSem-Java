public class Main {
    public static void main(String[] args) {
//        Student s1=new Student();
//        s1.name="Ram";
//        s1.faculty="IT";
//        s1.printFaculty();

        Student s2=new Student();
        s2.name="Shyam";
        s2.faculty="Management";
        System.out.println("S2 Name " + s2.name);
        System.out.println("S2 Faculty " + s2.faculty);


        Student s3=new Student("Hari", "BBA");
        System.out.println("S3 Name " + s3.name);
        System.out.println("S3 Faculty " + s3.faculty);
    }
}
