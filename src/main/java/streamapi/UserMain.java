package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserMain {
    public static void main(String[] args) {
        User u1=new User(1,"Ram","ram@123");
        User u2=new User(2,"Shyam","user@123");
        User u3=new User(3,"Hari","user@123");
        User u4=new User(4,"Gita","user@123");
        User u5=new User(5,"Sita","user@123");

        List<User> users= new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);

        List<UserView> userViewList= users.stream()
                .map(user->{
                    int id = user.getId();
                    String username = user.getUsername();

                    UserView userView=new UserView();
                    userView.setId(id);
                    userView.setUsername(username);

                    return userView;
                }).collect(Collectors.toList());

        System.out.println(userViewList);
    }
}
