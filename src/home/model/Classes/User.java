package home.model.Classes;

import java.util.Objects;

/**
 * User
 */
public class User {
   private String e_mail;
   private String password; 


    public User() {
    }

    public User(String e_mail, String password) {
        this.e_mail = e_mail;
        this.password = password;
    }

    public String getE_mail() {
        return this.e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User e_mail(String e_mail) {
        this.e_mail = e_mail;
        return this;
    }

    public User password(String password) {
        this.password = password;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(e_mail, user.e_mail) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(e_mail, password);
    }

    @Override
    public String toString() {
        return "{" +
            " e_mail='" + getE_mail() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }

}