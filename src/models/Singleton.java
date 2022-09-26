package models;

public class Singleton {

    private static String con;

    public String getConnection(){
        if(con == null) con = "open";
        return con;
    }

    private Singleton(){} // Konstruktor je privátní, aby nebylo možné vytvářet instance z jiných tříd
}
