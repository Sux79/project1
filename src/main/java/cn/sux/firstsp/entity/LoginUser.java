package cn.sux.firstsp.entity;

public class LoginUser {

    private Number id;
    private String login_name;
    private Number phone;
    private String maile;
    private Number role;

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public Number getPhone() {
        return phone;
    }

    public void setPhone(Number phone) {
        this.phone = phone;
    }

    public String getMaile() {
        return maile;
    }

    public void setMaile(String maile) {
        this.maile = maile;
    }

    public Number getRole() {
        return role;
    }

    public void setRole(Number role) {
        this.role = role;
    }
}
