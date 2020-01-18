package eu.marcinszewczyk.singleton;

public final class Connection {

    private static Connection instance = null;

    private String address;
    private String login;

    private Connection() {
    }

    public static Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
        }
        return instance;
    };

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
