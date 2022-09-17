package GoogleAuth;

import Entities.concretes.User;

public class GoogleAuthManager {
    public void register(User user){
        System.out.println("Sayın "+user.getName()+" "+user.getSurname()+" Google hesabınız ile kayıt oldunuz.");
    }
    public void login(User user){
        System.out.println("Sayın "+user.getName()+" "+user.getSurname()+" Google hesabınız ile giriş yaptınız.");
    }
}
