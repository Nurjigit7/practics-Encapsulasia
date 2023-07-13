import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        User user = new User(1, "Nurjigit", "Umarov", "nurjigit22@gmail.com");
//        User user1 = new User(2, "Aigerim", "Bazarbaieva", "Aigerim@gmail.com");
//        User user2 = new User(3, "Aidai", "Ysmailova", "Aidai@gmail.com");
//        User user3 = new User(4, "Rysbek", "Sharapov", "Rysbek@gmail.com");
//        User user4 = new User(5, "Meder", "Tynychbekov", "Meder22@gmail.com");
        User user = new User();
        user.setId(1);
        user.setName("Nurjigit");
        user.setLastName("Umarov");
        user.setEmail("Nurjigit@gmail.com");
        User user1 = new User();
        user1.setId(2);
        user1.setName("Aigerim");
        user1.setLastName("Bazarbaieva");
        user1.setEmail("Aigerim@gmail.com");
        User user2 = new User();
        user2.setId(3);
        user2.setName("Aiday");
        user2.setLastName("Ysmailova");
        user2.setEmail("Aiday@gmail.com");
        User user3 = new User();
        user3.setId(4);
        user3.setName("Rysbek");
        user3.setLastName("Shaparov");
        user3.setEmail("Rysbek@gmail.com");
        User user4 = new User();
        user4.setId(5);
        user4.setName("Meder");
        user4.setLastName("Tynychbekov");
        user4.setEmail("Meder@gmail.com");

        User[] users = {user, user1, user2, user3, user4};

        method(users, 2);
        method2(users, "Meder");


    }

    public static void method(User[] users, int id) {
        //  User user=new User();
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId() == id) {
                System.out.println(users[i].getId());
                System.out.println(users[i].getName());
                System.out.println(users[i].getLastName());
                System.out.println(users[i].getEmail());
            }

        }

    }

    public static void method2(User[] users, String name) {
        for (int i = 0; i < users.length; i++) {
            if (Objects.equals(users[i].getName(), name)) {
                System.out.println(users[i].getId());
                System.out.println(users[i].getName());
                System.out.println(users[i].getLastName());
                System.out.println(users[i].getEmail());
            }

        }

    }
}