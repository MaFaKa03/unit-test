package Main;

public class User {

    String name;
    String password;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;

    }
    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    //3.6.
    public boolean auth(String name, String password) {
        isAuthenticate = this.name == name && this.password == password;
        return isAuthenticate;
    }

}