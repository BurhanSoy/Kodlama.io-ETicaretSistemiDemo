import AppleAuth.AppleAuthManager;
import Business.abstracts.UserService;
import Business.concretes.UserManager;
import Core.AppleAuthManagerAdapter;
import DataAccess.concretes.HibernateUserDao;
import Entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserManager(new HibernateUserDao(),
                new AppleAuthManagerAdapter(new AppleAuthManager()));

        User user =new User("Burhan", "Soy", "burhansoy1@gmail.com","123456",true);
        User user1 = new User("İrem", "Soy", "dmrykirem@gmail.com","123455",true);
        userService.register(user);
        userService.login(user);
        userService.confirm(user);
        userService.registerWithAccount(user1);
        userService.loginWithAccount(user1);
    }
}
