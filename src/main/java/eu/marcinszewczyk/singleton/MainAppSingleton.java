package eu.marcinszewczyk.singleton;

public class MainAppSingleton {

    public static void main(String[] args) {

        Connection pierwszy = Connection.getInstance();
        Connection drugi = Connection.getInstance();
        Connection trzeci = Connection.getInstance();

        pierwszy.setAddress("w");
        drugi.setAddress("adres 2");
        trzeci.setAddress("adres 3");

        System.out.println(pierwszy.getAddress());
    }

}
