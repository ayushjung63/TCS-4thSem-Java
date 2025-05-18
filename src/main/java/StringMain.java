public class StringMain {
    public static void main(String[] args) {

        String college="TCS";
        String college2="TCS";
        System.out.println(college == college2);

        String s1=new String("hello");
        String s2=new String("hello");

        boolean isEqual = s1 == s2;
        boolean isEquals2 = s1.equals(s2);

        System.out.println(isEqual);
        System.out.println(isEquals2);
    }
}
