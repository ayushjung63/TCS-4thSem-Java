package abstractionex;

public class Client {
    public static void main(String[] args) {
        /*
        * Client depends on WebsiteDeveloper (Interface)
        * The right side implementation can be anything :: client do not depend on the implementation
        * */
        WebsiteDeveloper developer=new PHPWebsiteDeveloperImpl();
        developer.createWebsite();
    }
}
