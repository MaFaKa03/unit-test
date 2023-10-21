package Main;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    private static List<User> data = new ArrayList<>();
    public static void logoutAllWithoutAdmin(){
        for (int i = 0; i < data.size(); i++) {
            if (!data.get(i).isAdmin)
                data.remove(i);
        }
    }
    public static void addUser(User user) {
       if (user.isAuthenticate){
           data.add(user);
       }
    }

    public UserRepository() {
    }

    public static List<User> getData() {
        return data;
    }

    public static void setData(List<User> data) {
        UserRepository.data = data;
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

}