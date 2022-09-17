package DataAccess.concretes;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    List<User> users = new ArrayList<User>();
    @Override
    public void register(User user) {
        System.out.println(user.getName()+ "isimli kullanıcı başarı ile kaydolmuştur.");
        users.add(user);
    }

    @Override
    public void login(User user) {
        System.out.println(user.getName() + " adlı kullanıcı giriş yaptı.");
    }

    @Override
    public void confirm(User user) {
        System.out.println(user.getEmail()+ " email adresiniz onaylanmıştır.");
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }
}
