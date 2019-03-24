package lesson5.part2;

import java.util.Date;

public class Users {
    private long id;
    private String nick;
    private String password;
    private String email;
    private Date dateLogin;
    private double carma;
    private String ip;

    public Users(long id, String nick, String password, String email, Date dateLogin, double carma, String ip) {
        this.id = id;
        this.nick = nick;
        this.password = password;
        this.email = email;
        this.dateLogin = dateLogin;
        this.carma = carma;
        this.ip = ip;
    }

    public Users(long id) {
        this.id = id;
    }
}
